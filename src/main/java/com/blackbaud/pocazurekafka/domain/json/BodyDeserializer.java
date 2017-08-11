package com.blackbaud.pocazurekafka.domain.json;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

public class BodyDeserializer extends StdDeserializer{

    private static ObjectMapper bodyMapper = new ObjectMapper();

    public BodyDeserializer() {
        this(null);
    }

    private BodyDeserializer(Class<?> c){
        super(c);
    }

    @Override
    public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        String bodyText = p.getText();
        return bodyMapper.readValue(bodyText, Body.class);
    }
}
