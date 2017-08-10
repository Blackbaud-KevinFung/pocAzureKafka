package com.blackbaud.pocazurekafka.services;

import com.microsoft.azure.servicebus.ISubscriptionClient;
import com.microsoft.azure.servicebus.MessageHandlerOptions;
import com.microsoft.azure.servicebus.ReceiveMode;
import com.microsoft.azure.servicebus.SubscriptionClient;
import com.microsoft.azure.servicebus.primitives.ConnectionStringBuilder;
import com.microsoft.azure.servicebus.primitives.ServiceBusException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.Duration;

@Slf4j
@Component
public class AzureServiceBusMessageReader {
    private static final String connectionString = "Endpoint=sb://entitlementbroadcast.servicebus.windows.net/;SharedAccessKeyName=Consumer;SharedAccessKey=z1QurUHu1ZNVN9gMA7/xUJGyFVk8bXtyfWTr5NbEBx4=";
    private static final String topicName = "entitlementate";
    private static final String subscriptionName = "lo_validation";
    private static ISubscriptionClient subscriptionClient;

    @PostConstruct
    public void handleMessage() {
        try {
            log.info("creating subscription client");
            subscriptionClient = new SubscriptionClient(new ConnectionStringBuilder(connectionString, topicName + "/subscriptions/" + subscriptionName), ReceiveMode.PeekLock);
            subscriptionClient.registerMessageHandler(new MessageHandler(subscriptionClient), new MessageHandlerOptions(1, false, Duration.ofMinutes(1)));
        } catch (InterruptedException | ServiceBusException e) {
            log.error("something went wrong with the service bus");
        }
    }


}
