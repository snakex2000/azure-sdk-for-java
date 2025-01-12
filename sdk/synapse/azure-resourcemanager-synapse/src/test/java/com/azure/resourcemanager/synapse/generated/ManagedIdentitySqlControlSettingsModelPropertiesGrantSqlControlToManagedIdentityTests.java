// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.models.DesiredState;
import com.azure.resourcemanager.synapse.models.ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentity;
import org.junit.jupiter.api.Assertions;

public final class ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentity model
            = BinaryData.fromString("{\"desiredState\":\"Enabled\",\"actualState\":\"Disabling\"}")
                .toObject(ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentity.class);
        Assertions.assertEquals(DesiredState.ENABLED, model.desiredState());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentity model
            = new ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentity()
                .withDesiredState(DesiredState.ENABLED);
        model = BinaryData.fromObject(model)
            .toObject(ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentity.class);
        Assertions.assertEquals(DesiredState.ENABLED, model.desiredState());
    }
}
