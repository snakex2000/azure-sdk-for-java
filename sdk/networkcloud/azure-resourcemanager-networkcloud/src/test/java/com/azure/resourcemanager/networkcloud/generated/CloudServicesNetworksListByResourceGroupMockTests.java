// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.networkcloud.NetworkCloudManager;
import com.azure.resourcemanager.networkcloud.models.CloudServicesNetwork;
import com.azure.resourcemanager.networkcloud.models.CloudServicesNetworkEnableDefaultEgressEndpoints;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class CloudServicesNetworksListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"value\":[{\"extendedLocation\":{\"name\":\"wdfmmpzhzzwvywr\",\"type\":\"yngydgrpxncaki\"},\"properties\":{\"additionalEgressEndpoints\":[{\"category\":\"djrkclamggl\",\"endpoints\":[{\"domainName\":\"mfejdoqeykglty\"}]},{\"category\":\"xhqf\",\"endpoints\":[{\"domainName\":\"ka\"},{\"domainName\":\"ejsxt\"}]},{\"category\":\"gflwfgziiucijj\",\"endpoints\":[{\"domainName\":\"atlijjjr\"},{\"domainName\":\"va\"},{\"domainName\":\"caszk\"},{\"domainName\":\"xk\"}]}],\"associatedResourceIds\":[\"xetyvku\",\"mignohikkg\",\"ogjwpindedvabbxb\",\"medeil\"],\"clusterId\":\"ywfcfxzi\",\"detailedStatus\":\"Available\",\"detailedStatusMessage\":\"hvwyp\",\"enableDefaultEgressEndpoints\":\"True\",\"enabledEgressEndpoints\":[{\"category\":\"slczwciidjsllf\",\"endpoints\":[{\"domainName\":\"vdmvxadqa\"},{\"domainName\":\"frgnawbabgfbktyj\"}]},{\"category\":\"fczlfsyqkfrbzgow\",\"endpoints\":[{\"domainName\":\"qmje\"},{\"domainName\":\"jcx\"},{\"domainName\":\"yqgxhlus\"}]},{\"category\":\"vxisimjcea\",\"endpoints\":[{\"domainName\":\"jqvlsumywz\"},{\"domainName\":\"shxgonoy\"}]}],\"hybridAksClustersAssociatedIds\":[\"ipubyznclkfk\",\"ebgvo\"],\"interfaceName\":\"m\",\"provisioningState\":\"Accepted\",\"virtualMachinesAssociatedIds\":[\"jly\",\"gqa\"]},\"location\":\"igflqqbtnyjp\",\"tags\":{\"s\":\"dbfvabmv\"},\"id\":\"baevwjcnkottl\",\"name\":\"uhvajmailfemjjza\",\"type\":\"zwjiqullq\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        NetworkCloudManager manager = NetworkCloudManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<CloudServicesNetwork> response
            = manager.cloudServicesNetworks().listByResourceGroup("tuicds", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("igflqqbtnyjp", response.iterator().next().location());
        Assertions.assertEquals("dbfvabmv", response.iterator().next().tags().get("s"));
        Assertions.assertEquals("wdfmmpzhzzwvywr", response.iterator().next().extendedLocation().name());
        Assertions.assertEquals("yngydgrpxncaki", response.iterator().next().extendedLocation().type());
        Assertions.assertEquals("djrkclamggl",
            response.iterator().next().additionalEgressEndpoints().get(0).category());
        Assertions.assertEquals("mfejdoqeykglty",
            response.iterator().next().additionalEgressEndpoints().get(0).endpoints().get(0).domainName());
        Assertions.assertEquals(CloudServicesNetworkEnableDefaultEgressEndpoints.TRUE,
            response.iterator().next().enableDefaultEgressEndpoints());
    }
}
