// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.fluent.models.LanguageExtensionInner;
import com.azure.resourcemanager.synapse.models.LanguageExtensionName;
import org.junit.jupiter.api.Assertions;

public final class LanguageExtensionInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LanguageExtensionInner model
            = BinaryData.fromString("{\"languageExtensionName\":\"PYTHON\"}").toObject(LanguageExtensionInner.class);
        Assertions.assertEquals(LanguageExtensionName.PYTHON, model.languageExtensionName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LanguageExtensionInner model
            = new LanguageExtensionInner().withLanguageExtensionName(LanguageExtensionName.PYTHON);
        model = BinaryData.fromObject(model).toObject(LanguageExtensionInner.class);
        Assertions.assertEquals(LanguageExtensionName.PYTHON, model.languageExtensionName());
    }
}
