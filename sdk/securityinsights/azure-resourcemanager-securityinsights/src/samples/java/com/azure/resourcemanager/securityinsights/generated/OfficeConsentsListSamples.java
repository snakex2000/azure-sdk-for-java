// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

/**
 * Samples for OfficeConsents List.
 */
public final class OfficeConsentsListSamples {
    /*
     * x-ms-original-file:
     * specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-09-01-preview/examples/
     * officeConsents/GetOfficeConsents.json
     */
    /**
     * Sample code: Get all office consents.
     * 
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void
        getAllOfficeConsents(com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager.officeConsents().list("myRg", "myWorkspace", com.azure.core.util.Context.NONE);
    }
}
