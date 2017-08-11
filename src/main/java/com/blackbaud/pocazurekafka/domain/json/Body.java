package com.blackbaud.pocazurekafka.domain.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import org.apache.avro.reflect.Nullable;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Body {
    @JsonProperty("LegalEntityId")
    private String legalEntityId;

    @JsonProperty("EnvironmentId")
    private String environmentId;

    @JsonProperty("EntitlementId")
    private String entitlementId;

    @JsonProperty("EntitlementType")
    private String entitlementType;

    @JsonProperty("ErrorMessage")
    @Nullable
    private String errorMessage;

    @JsonProperty("EntitlementEventActionType")
    private int entitlementEventActionType;
}
