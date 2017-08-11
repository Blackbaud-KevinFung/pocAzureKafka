package com.blackbaud.pocazurekafka.services;

import com.blackbaud.pocazurekafka.domain.json.Body;
import com.blackbaud.pocazurekafka.domain.json.Entitlement;
import com.blackbaud.pocazurekafka.domain.json.Topic;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.azure.servicebus.ExceptionPhase;
import com.microsoft.azure.servicebus.IMessage;
import com.microsoft.azure.servicebus.IMessageHandler;
import com.microsoft.azure.servicebus.ISubscriptionClient;
import lombok.extern.slf4j.Slf4j;
import org.apache.avro.Schema;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.generic.GenericRecordBuilder;
import org.apache.avro.reflect.ReflectData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

@Slf4j
@Component
public class MessageHandler implements IMessageHandler{
    @Autowired
    private ISubscriptionClient subscriptionClient;

    @Autowired
    private AzureKafkaProducer azureKafkaProducer;

//    @Autowired
//    private Schema entitlementSchema;

    @Override
    public CompletableFuture<Void> onMessageAsync(IMessage iMessage) {
        log.info(String.format("Received message with sq#: %d and lock token: %s.", iMessage.getSequenceNumber(), iMessage.getLockToken()));
        log.info(new String(iMessage.getBody()));
        return this.subscriptionClient.completeAsync(iMessage.getLockToken()).thenRunAsync(() -> {
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                Entitlement entitlement = objectMapper.readValue(iMessage.getBody(), Entitlement.class);
                log.info("**** Entitlement = " + entitlement.getTopic().getName() + " ****");
                GenericRecord record = transformToGenericRecord(entitlement);
                log.info("======Generic Record==== " + record.get("body"));
                azureKafkaProducer.produce(entitlement, record);
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

    private GenericRecord transformToGenericRecord(Entitlement entitlement) {
        Schema bodySchema = ReflectData.get().getSchema(Body.class);
        Schema topicSchema = ReflectData.get().getSchema(Topic.class);
        Schema entitlementSchema = ReflectData.get().getSchema(Entitlement.class);


        GenericRecord bodyRecord = new GenericRecordBuilder(bodySchema)
                .set("legalEntityId", entitlement.getBody().getLegalEntityId())
                .set("environmentId", entitlement.getBody().getEnvironmentId())
                .set("entitlementId", entitlement.getBody().getEntitlementId())
                .set("entitlementType", entitlement.getBody().getEntitlementType())
                .set("errorMessage", entitlement.getBody().getErrorMessage())
                .set("entitlementEventActionType", entitlement.getBody().getEntitlementEventActionType())
                .build();

        GenericRecord topicRecord = new GenericRecordBuilder(topicSchema)
                .set("name", entitlement.getTopic().getName())
                .build();

        return new GenericRecordBuilder(entitlementSchema)
                .set("body", bodyRecord)
                .set("topic", topicRecord)
                .set("schema", entitlement.getSchema())
                .build();
    }
}
