package com.blackbaud.pocazurekafka.config;

import com.blackbaud.kafka.config.ProducerConfig;
import com.blackbaud.pocazurekafka.Pocazurekafka;
import com.microsoft.azure.servicebus.ISubscriptionClient;
import com.microsoft.azure.servicebus.ReceiveMode;
import com.microsoft.azure.servicebus.SubscriptionClient;
import com.microsoft.azure.servicebus.primitives.ConnectionStringBuilder;
import com.microsoft.azure.servicebus.primitives.ServiceBusException;
import org.apache.avro.Schema;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.io.IOException;
import java.io.InputStream;

@Configuration
@Import(ProducerConfig.class)
public class PocAzureKafkaConfig {
    private static final String connectionString = "Endpoint=sb://entitlementbroadcast.servicebus.windows.net/;SharedAccessKeyName=Consumer;SharedAccessKey=z1QurUHu1ZNVN9gMA7/xUJGyFVk8bXtyfWTr5NbEBx4=";
    private static final String topicName = "entitlementate";
    private static final String subscriptionName = "lo_validation";

    @Bean
    public Schema entitlementSchema() throws IOException {
        InputStream in = PocAzureKafkaConfig.class.getResourceAsStream("/schemas/entitlement.avsc");
        Schema.Parser parser = new Schema.Parser();
        return parser.parse(in);
    }

    @Bean
    public ISubscriptionClient azureKafkaSubscriptionClient() throws InterruptedException, ServiceBusException {
        return new SubscriptionClient(new ConnectionStringBuilder(connectionString, topicName + "/subscriptions/" + subscriptionName), ReceiveMode.PeekLock);
    }
}
