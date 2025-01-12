// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.models;

import com.azure.resourcemanager.cognitiveservices.fluent.models.AccountSkuListResultInner;
import java.util.List;

/**
 * An immutable client-side representation of AccountSkuListResult.
 */
public interface AccountSkuListResult {
    /**
     * Gets the value property: Gets the list of Cognitive Services accounts and their properties.
     * 
     * @return the value value.
     */
    List<AccountSku> value();

    /**
     * Gets the inner com.azure.resourcemanager.cognitiveservices.fluent.models.AccountSkuListResultInner object.
     * 
     * @return the inner object.
     */
    AccountSkuListResultInner innerModel();
}
