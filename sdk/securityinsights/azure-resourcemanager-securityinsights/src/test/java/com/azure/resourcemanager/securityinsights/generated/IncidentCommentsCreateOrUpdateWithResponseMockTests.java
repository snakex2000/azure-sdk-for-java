// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.securityinsights.SecurityInsightsManager;
import com.azure.resourcemanager.securityinsights.models.IncidentComment;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class IncidentCommentsCreateOrUpdateWithResponseMockTests {
    @Test
    public void testCreateOrUpdateWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"createdTimeUtc\":\"2021-04-26T07:52:13Z\",\"lastModifiedTimeUtc\":\"2021-10-13T04:51:25Z\",\"message\":\"argvfvkhbjhmv\",\"author\":{\"email\":\"sdhwe\",\"name\":\"nybffqcwwyn\",\"objectId\":\"7386ddfe-0688-41dd-a697-e4e2f8ef435c\",\"userPrincipalName\":\"tvmwgvconyse\"}},\"etag\":\"ijfhpxnikouoxfal\",\"id\":\"bskkypor\",\"name\":\"ynieunbydlgfaphw\",\"type\":\"ubwt\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SecurityInsightsManager manager = SecurityInsightsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        IncidentComment response = manager.incidentComments()
            .define("hbtofc")
            .withExistingIncident("rthldwvoglff", "dhg", "lor")
            .withEtag("vrrqfibpkwmamrl")
            .withMessage("cnsdy")
            .create();

        Assertions.assertEquals("ijfhpxnikouoxfal", response.etag());
        Assertions.assertEquals("argvfvkhbjhmv", response.message());
    }
}
