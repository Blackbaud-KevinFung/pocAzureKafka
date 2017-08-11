package com.blackbaud.pocazurekafka.services;

import com.blackbaud.pocazurekafka.domain.json.Entitlement;
import lombok.extern.slf4j.Slf4j;
import org.apache.avro.generic.GenericRecord;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

@Component
@Slf4j
public class AzureKafkaProducer {
    @Autowired
    private Producer producer;

    private String contactableEntityTopicName = "TEST-ENTITLEMENT_MAPPING";

    public Future produce(Entitlement entity, GenericRecord entitlementEntityMessage) {
        ProducerRecord<String, GenericRecord> producerRecord = new ProducerRecord<>(contactableEntityTopicName, entity.getBody().getEntitlementId().toString(), entitlementEntityMessage);
        Future<RecordMetadata> future = producer.send(producerRecord);
        return future;
    }
}
