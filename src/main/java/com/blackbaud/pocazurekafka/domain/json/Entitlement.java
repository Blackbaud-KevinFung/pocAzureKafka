package com.blackbaud.pocazurekafka.domain.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Getter;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Entitlement {
    @JsonDeserialize(using = BodyDeserializer.class)
    private Body body;

    @JsonProperty("topic")
    private Topic topic;

    @JsonProperty("schema")
    private String schema;
}
