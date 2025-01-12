// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.devtestlabs.DevTestLabsManager;
import com.azure.resourcemanager.devtestlabs.models.UsagePermissionType;
import com.azure.resourcemanager.devtestlabs.models.VirtualNetwork;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class VirtualNetworksListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"value\":[{\"properties\":{\"allowedSubnets\":[{\"resourceId\":\"yjfzi\",\"labSubnetName\":\"io\",\"allowPublicIp\":\"Allow\"},{\"resourceId\":\"pajtfeyvkbd\",\"labSubnetName\":\"dkrhdccxbe\",\"allowPublicIp\":\"Deny\"}],\"description\":\"tkzwtj\",\"externalProviderResourceId\":\"guzytijc\",\"externalSubnets\":[{\"id\":\"ndegjdydhqkkkbj\",\"name\":\"kcat\"},{\"id\":\"bhpowcnxtpzdlys\",\"name\":\"dtoakatpryt\"},{\"id\":\"hzbqfdpfawrptvcs\",\"name\":\"kutzct\"}],\"subnetOverrides\":[{\"resourceId\":\"dirdammtzjgc\",\"labSubnetName\":\"fxtbwjjirmuydg\",\"useInVmCreationPermission\":\"Default\",\"usePublicIpAddressPermission\":\"Allow\",\"sharedPublicIpAddressConfiguration\":{\"allowedPorts\":[{},{},{}]},\"virtualNetworkPoolName\":\"oagfuoftnxodwx\"},{\"resourceId\":\"aj\",\"labSubnetName\":\"ygmgsevm\",\"useInVmCreationPermission\":\"Deny\",\"usePublicIpAddressPermission\":\"Default\",\"sharedPublicIpAddressConfiguration\":{\"allowedPorts\":[{},{}]},\"virtualNetworkPoolName\":\"gfc\"}],\"createdDate\":\"2021-02-10T10:42:45Z\",\"provisioningState\":\"n\",\"uniqueIdentifier\":\"dtjva\"},\"location\":\"yyznmrgcdogcvuc\",\"tags\":{\"bgszplusdek\":\"oxuwhttnzqsaqm\"},\"id\":\"dzzmssgpgv\",\"name\":\"kyejidbdq\",\"type\":\"squnycwztlv\"}]}";

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

        DevTestLabsManager manager = DevTestLabsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<VirtualNetwork> response = manager.virtualNetworks()
            .list("z", "pvwdtgckzdqiq", "lrat", "kwx", 2099822665, "uwxsuykznhrfgsl", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("yyznmrgcdogcvuc", response.iterator().next().location());
        Assertions.assertEquals("oxuwhttnzqsaqm", response.iterator().next().tags().get("bgszplusdek"));
        Assertions.assertEquals("yjfzi", response.iterator().next().allowedSubnets().get(0).resourceId());
        Assertions.assertEquals("io", response.iterator().next().allowedSubnets().get(0).labSubnetName());
        Assertions.assertEquals(UsagePermissionType.ALLOW,
            response.iterator().next().allowedSubnets().get(0).allowPublicIp());
        Assertions.assertEquals("tkzwtj", response.iterator().next().description());
        Assertions.assertEquals("guzytijc", response.iterator().next().externalProviderResourceId());
        Assertions.assertEquals("dirdammtzjgc", response.iterator().next().subnetOverrides().get(0).resourceId());
        Assertions.assertEquals("fxtbwjjirmuydg", response.iterator().next().subnetOverrides().get(0).labSubnetName());
        Assertions.assertEquals(UsagePermissionType.DEFAULT,
            response.iterator().next().subnetOverrides().get(0).useInVmCreationPermission());
        Assertions.assertEquals(UsagePermissionType.ALLOW,
            response.iterator().next().subnetOverrides().get(0).usePublicIpAddressPermission());
        Assertions.assertEquals("oagfuoftnxodwx",
            response.iterator().next().subnetOverrides().get(0).virtualNetworkPoolName());
    }
}
