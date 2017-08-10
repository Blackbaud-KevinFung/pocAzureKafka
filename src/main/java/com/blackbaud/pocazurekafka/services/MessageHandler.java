package com.blackbaud.pocazurekafka.services;

import com.microsoft.azure.servicebus.ExceptionPhase;
import com.microsoft.azure.servicebus.IMessage;
import com.microsoft.azure.servicebus.IMessageHandler;
import com.microsoft.azure.servicebus.ISubscriptionClient;
import lombok.extern.slf4j.Slf4j;
import org.apache.avro.Schema;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.DecoderFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

@Slf4j
public class MessageHandler implements IMessageHandler{
    private ISubscriptionClient subscriptionClient;
    @Autowired
    Schema entitlementSchema;

    public MessageHandler(ISubscriptionClient subscriptionClient) {
        this.subscriptionClient = subscriptionClient;
    }

    @Override
    public CompletableFuture<Void> onMessageAsync(IMessage iMessage) {
        log.info(String.format("Received message with sq#: %d and lock token: %s.", iMessage.getSequenceNumber(), iMessage.getLockToken()));
        log.info(new String(iMessage.getBody()));
        GenericDatumReader<GenericRecord> reader = new GenericDatumReader<>(entitlementSchema);
        GenericRecord record = null;
        try {
            record = reader.read(null, DecoderFactory.get().binaryDecoder(iMessage.getBody(), null));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ArrayIndexOutOfBoundsException e2) {
            e2.printStackTrace();
        } catch (Exception e3) {
            e3.printStackTrace();
            throw new RuntimeException(e3);
        }
        log.info((record != null ? record.toString() : "==============Generic Record was not created correctly.=============="));
        return this.subscriptionClient.completeAsync(iMessage.getLockToken()).thenRunAsync(() -> {
            log.info(String.format("Completed message sq#: %d and locktoken: %s", iMessage.getSequenceNumber(), iMessage.getLockToken()));
        });
    }

    @Override
    public void notifyException(Throwable throwable, ExceptionPhase exceptionPhase) {
        log.error(exceptionPhase + "-" + throwable.getMessage());
    }
}
