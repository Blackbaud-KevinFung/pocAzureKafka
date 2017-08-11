package com.blackbaud.pocazurekafka.domain.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Body {
    @JsonProperty("LegalEntityId")
    private String legalEntityId;

    @JsonProperty("EnvironmentId")
    private String envrionmentId;

    @JsonProperty("EntitlementId")
    private String entitlementId;

    @JsonProperty("EntitlementType")
    private String entitlementType;

    @JsonProperty("ErrorMessage")
    private String errorMessage;

    @JsonProperty("EntitlementEventActionType")
    private int entitlementEventActionType;
}
