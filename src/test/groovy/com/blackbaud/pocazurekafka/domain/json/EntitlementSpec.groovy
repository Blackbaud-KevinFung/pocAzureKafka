package com.blackbaud.pocazurekafka.domain.json

import com.fasterxml.jackson.databind.ObjectMapper
import spock.lang.Specification


class EntitlementSpec extends Specification {
    def "Can parse entitlements' screwy JSON"() {
        given:
        String json = '''{"body":"{\\"LegalEntityId\\":\\"p-yJDxxoI2r0-cRrA7Pz4dsQ\\",\\"EnvironmentId\\":\\"p-0RlXaRvJIEiPoubwLFdS8A\\",\\"EntitlementId\\":\\"titleId101\\",\\"EntitlementType\\":\\"entitlementype\\",\\"ErrorMessage\\":null,\\"EntitlementEventActionType\\":1}","topic":{"name":"entitlementate"},"schema":"entitlement-1.0"}'''

        ObjectMapper mapper = new ObjectMapper()

        when:
        Entitlement entitlement = mapper.readValue(json, Entitlement.class)

        then:
        assert entitlement.body.legalEntityId == "p-yJDxxoI2r0-cRrA7Pz4dsQ"
    }
}
