// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quantum.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.quantum.models.TargetDescription;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class TargetDescriptionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TargetDescription model = BinaryData.fromString(
            "{\"id\":\"rmfqjhhkxbpvj\",\"name\":\"jhxxjyn\",\"description\":\"divkrt\",\"acceptedDataFormats\":[\"xqzvszjfa\"],\"acceptedContentEncodings\":[\"fdxxivetvtcqaqtd\"]}")
            .toObject(TargetDescription.class);
        Assertions.assertEquals("rmfqjhhkxbpvj", model.id());
        Assertions.assertEquals("jhxxjyn", model.name());
        Assertions.assertEquals("divkrt", model.description());
        Assertions.assertEquals("xqzvszjfa", model.acceptedDataFormats().get(0));
        Assertions.assertEquals("fdxxivetvtcqaqtd", model.acceptedContentEncodings().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TargetDescription model = new TargetDescription().withId("rmfqjhhkxbpvj")
            .withName("jhxxjyn")
            .withDescription("divkrt")
            .withAcceptedDataFormats(Arrays.asList("xqzvszjfa"))
            .withAcceptedContentEncodings(Arrays.asList("fdxxivetvtcqaqtd"));
        model = BinaryData.fromObject(model).toObject(TargetDescription.class);
        Assertions.assertEquals("rmfqjhhkxbpvj", model.id());
        Assertions.assertEquals("jhxxjyn", model.name());
        Assertions.assertEquals("divkrt", model.description());
        Assertions.assertEquals("xqzvszjfa", model.acceptedDataFormats().get(0));
        Assertions.assertEquals("fdxxivetvtcqaqtd", model.acceptedContentEncodings().get(0));
    }
}
