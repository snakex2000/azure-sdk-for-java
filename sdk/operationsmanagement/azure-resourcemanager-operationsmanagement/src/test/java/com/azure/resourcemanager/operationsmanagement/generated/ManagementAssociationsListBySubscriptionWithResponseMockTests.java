// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationsmanagement.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.operationsmanagement.OperationsManagementManager;
import com.azure.resourcemanager.operationsmanagement.models.ManagementAssociationPropertiesList;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ManagementAssociationsListBySubscriptionWithResponseMockTests {
    @Test
    public void testListBySubscriptionWithResponse() throws Exception {
        String responseStr
            = "{\"value\":[{\"location\":\"rhhbcs\",\"properties\":{\"applicationId\":\"ummajtjaod\"},\"id\":\"obnbdxkqpxokaj\",\"name\":\"onpimexgstxg\",\"type\":\"po\"},{\"location\":\"maajrmvdjwzrlo\",\"properties\":{\"applicationId\":\"clwhijcoejctbz\"},\"id\":\"qsqsy\",\"name\":\"bkbfkgukdkex\",\"type\":\"ppofmxaxcfjpgdd\"},{\"location\":\"c\",\"properties\":{\"applicationId\":\"xhvpmoue\"},\"id\":\"hd\",\"name\":\"xibqeojnx\",\"type\":\"bzv\"},{\"location\":\"ntwndeicbtwnpzao\",\"properties\":{\"applicationId\":\"uhrhcffcyddgl\"},\"id\":\"jthjqkwpyei\",\"name\":\"xmqci\",\"type\":\"q\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        OperationsManagementManager manager = OperationsManagementManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        ManagementAssociationPropertiesList response = manager.managementAssociations()
            .listBySubscriptionWithResponse(com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("rhhbcs", response.value().get(0).location());
        Assertions.assertEquals("ummajtjaod", response.value().get(0).properties().applicationId());
    }
}
