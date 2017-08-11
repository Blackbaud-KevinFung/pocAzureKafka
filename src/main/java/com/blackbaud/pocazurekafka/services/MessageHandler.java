package com.blackbaud.pocazurekafka.services;

import com.blackbaud.pocazurekafka.domain.json.Body;
import com.blackbaud.pocazurekafka.domain.json.Entitlement;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.azure.servicebus.ExceptionPhase;
import com.microsoft.azure.servicebus.IMessage;
import com.microsoft.azure.servicebus.IMessageHandler;
import com.microsoft.azure.servicebus.ISubscriptionClient;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringEscapeUtils;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@Slf4j
public class MessageHandler implements IMessageHandler{
    private ISubscriptionClient subscriptionClient;

    public MessageHandler(ISubscriptionClient subscriptionClient) {
        this.subscriptionClient = subscriptionClient;
    }

    @Override
    public CompletableFuture<Void> onMessageAsync(IMessage iMessage) {
        log.info(String.format("Received message with sq#: %d and lock token: %s.", iMessage.getSequenceNumber(), iMessage.getLockToken()));
        log.info(new String(iMessage.getBody()));
        return this.subscriptionClient.completeAsync(iMessage.getLockToken()).thenRunAsync(() -> {
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                Entitlement entitlement = objectMapper.readValue(iMessage.getBody(), Entitlement.class);
                log.info("**** Entitlement = " + entitlement.getTopic().getName() + " ****");
            } catch (IOException e) {
                e.printStackTrace();
            }
            log.info(String.format("Completed message sq#: %d and locktoken: %s", iMessage.getSequenceNumber(), iMessage.getLockToken()));
        });
    }

    @Override
    public void notifyException(Throwable throwable, ExceptionPhase exceptionPhase) {
        log.error(exceptionPhase + "-" + throwable.getMessage());
    }
}
