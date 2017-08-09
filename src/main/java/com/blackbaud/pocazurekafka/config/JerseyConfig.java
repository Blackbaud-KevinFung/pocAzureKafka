package com.blackbaud.pocazurekafka.config;

import com.blackbaud.boot.config.CommonJerseyConfig;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/")
public class JerseyConfig extends CommonJerseyConfig {

    @PostConstruct
    public void initialize() {
        super.initialize();
        packages("com.blackbaud.pocazurekafka.config");
    }

}
