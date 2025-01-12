// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.logic.models.ApiReference;
import com.azure.resourcemanager.logic.models.ApiTier;
import com.azure.resourcemanager.logic.models.ResourceReference;
import org.junit.jupiter.api.Assertions;

public final class ApiReferenceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApiReference model = BinaryData.fromString(
            "{\"displayName\":\"ykzzugctygbb\",\"description\":\"mljvv\",\"iconUri\":\"smwojm\",\"swagger\":\"datac\",\"brandColor\":\"mnrut\",\"category\":\"Standard\",\"integrationServiceEnvironment\":{\"id\":\"jftvltj\",\"name\":\"ecvpkbzltno\",\"type\":\"ajfhxsmubbzadz\"},\"id\":\"muuzpsuhsypx\",\"name\":\"ldhfrerkqpyf\",\"type\":\"kbyws\"}")
            .toObject(ApiReference.class);
        Assertions.assertEquals("muuzpsuhsypx", model.id());
        Assertions.assertEquals("ykzzugctygbb", model.displayName());
        Assertions.assertEquals("mljvv", model.description());
        Assertions.assertEquals("smwojm", model.iconUri());
        Assertions.assertEquals("mnrut", model.brandColor());
        Assertions.assertEquals(ApiTier.STANDARD, model.category());
        Assertions.assertEquals("jftvltj", model.integrationServiceEnvironment().id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApiReference model = new ApiReference().withId("muuzpsuhsypx")
            .withDisplayName("ykzzugctygbb")
            .withDescription("mljvv")
            .withIconUri("smwojm")
            .withSwagger("datac")
            .withBrandColor("mnrut")
            .withCategory(ApiTier.STANDARD)
            .withIntegrationServiceEnvironment(new ResourceReference().withId("jftvltj"));
        model = BinaryData.fromObject(model).toObject(ApiReference.class);
        Assertions.assertEquals("muuzpsuhsypx", model.id());
        Assertions.assertEquals("ykzzugctygbb", model.displayName());
        Assertions.assertEquals("mljvv", model.description());
        Assertions.assertEquals("smwojm", model.iconUri());
        Assertions.assertEquals("mnrut", model.brandColor());
        Assertions.assertEquals(ApiTier.STANDARD, model.category());
        Assertions.assertEquals("jftvltj", model.integrationServiceEnvironment().id());
    }
}
