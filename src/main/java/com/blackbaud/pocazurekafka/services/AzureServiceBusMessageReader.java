package com.blackbaud.pocazurekafka.services;

import com.microsoft.azure.servicebus.ISubscriptionClient;
import com.microsoft.azure.servicebus.MessageHandlerOptions;
import com.microsoft.azure.servicebus.primitives.ServiceBusException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.Duration;

@Slf4j
@Component
public class AzureServiceBusMessageReader {
    @Autowired
    private ISubscriptionClient subscriptionClient;

    @Autowired
    private MessageHandler messageHandler;

    @PostConstruct
    public void handleMessage() {
        try {
            log.info("creating subscription client");
            subscriptionClient.registerMessageHandler(messageHandler, new MessageHandlerOptions(1, false, Duration.ofMinutes(10)));
        } catch (InterruptedException | ServiceBusException e) {
            log.error("something went wrong with the service bus");
        }
    }


}
