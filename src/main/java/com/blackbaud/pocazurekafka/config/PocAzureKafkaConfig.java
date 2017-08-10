package com.blackbaud.pocazurekafka.config;

import com.blackbaud.pocazurekafka.Pocazurekafka;
import org.apache.avro.Schema;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.io.InputStream;

@Configuration
public class PocAzureKafkaConfig {
    @Bean
    public Schema entitlementSchema() throws IOException {
        InputStream in = Pocazurekafka.class.getResourceAsStream("/schemas/entitlement.avsc");
        Schema.Parser parser = new Schema.Parser();
        return parser.parse(in);
    }
}
