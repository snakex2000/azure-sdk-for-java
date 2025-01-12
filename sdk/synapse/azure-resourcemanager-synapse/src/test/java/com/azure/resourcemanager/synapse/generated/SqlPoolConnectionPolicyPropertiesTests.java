// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.fluent.models.SqlPoolConnectionPolicyProperties;
import org.junit.jupiter.api.Assertions;

public final class SqlPoolConnectionPolicyPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SqlPoolConnectionPolicyProperties model = BinaryData.fromString(
            "{\"securityEnabledAccess\":\"gnyhmossxkkg\",\"proxyDnsName\":\"rrghxjbdhqxvcxgf\",\"proxyPort\":\"dsofbshrns\",\"visibility\":\"uswdv\",\"useServerDefault\":\"ybycnunvj\",\"redirectionState\":\"tkfa\",\"state\":\"opqgikyzirtxdyux\"}")
            .toObject(SqlPoolConnectionPolicyProperties.class);
        Assertions.assertEquals("gnyhmossxkkg", model.securityEnabledAccess());
        Assertions.assertEquals("rrghxjbdhqxvcxgf", model.proxyDnsName());
        Assertions.assertEquals("dsofbshrns", model.proxyPort());
        Assertions.assertEquals("uswdv", model.visibility());
        Assertions.assertEquals("ybycnunvj", model.useServerDefault());
        Assertions.assertEquals("tkfa", model.redirectionState());
        Assertions.assertEquals("opqgikyzirtxdyux", model.state());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SqlPoolConnectionPolicyProperties model
            = new SqlPoolConnectionPolicyProperties().withSecurityEnabledAccess("gnyhmossxkkg")
                .withProxyDnsName("rrghxjbdhqxvcxgf")
                .withProxyPort("dsofbshrns")
                .withVisibility("uswdv")
                .withUseServerDefault("ybycnunvj")
                .withRedirectionState("tkfa")
                .withState("opqgikyzirtxdyux");
        model = BinaryData.fromObject(model).toObject(SqlPoolConnectionPolicyProperties.class);
        Assertions.assertEquals("gnyhmossxkkg", model.securityEnabledAccess());
        Assertions.assertEquals("rrghxjbdhqxvcxgf", model.proxyDnsName());
        Assertions.assertEquals("dsofbshrns", model.proxyPort());
        Assertions.assertEquals("uswdv", model.visibility());
        Assertions.assertEquals("ybycnunvj", model.useServerDefault());
        Assertions.assertEquals("tkfa", model.redirectionState());
        Assertions.assertEquals("opqgikyzirtxdyux", model.state());
    }
}
