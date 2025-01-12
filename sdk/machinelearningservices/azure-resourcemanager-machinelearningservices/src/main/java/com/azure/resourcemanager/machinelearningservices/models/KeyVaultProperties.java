// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The KeyVaultProperties model. */
@Fluent
public final class KeyVaultProperties {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(KeyVaultProperties.class);

    /*
     * The ArmId of the keyVault where the customer owned encryption key is
     * present.
     */
    @JsonProperty(value = "keyVaultArmId", required = true)
    private String keyVaultArmId;

    /*
     * Key vault uri to access the encryption key.
     */
    @JsonProperty(value = "keyIdentifier", required = true)
    private String keyIdentifier;

    /*
     * For future use - The client id of the identity which will be used to
     * access key vault.
     */
    @JsonProperty(value = "identityClientId")
    private String identityClientId;

    /**
     * Get the keyVaultArmId property: The ArmId of the keyVault where the customer owned encryption key is present.
     *
     * @return the keyVaultArmId value.
     */
    public String keyVaultArmId() {
        return this.keyVaultArmId;
    }

    /**
     * Set the keyVaultArmId property: The ArmId of the keyVault where the customer owned encryption key is present.
     *
     * @param keyVaultArmId the keyVaultArmId value to set.
     * @return the KeyVaultProperties object itself.
     */
    public KeyVaultProperties withKeyVaultArmId(String keyVaultArmId) {
        this.keyVaultArmId = keyVaultArmId;
        return this;
    }

    /**
     * Get the keyIdentifier property: Key vault uri to access the encryption key.
     *
     * @return the keyIdentifier value.
     */
    public String keyIdentifier() {
        return this.keyIdentifier;
    }

    /**
     * Set the keyIdentifier property: Key vault uri to access the encryption key.
     *
     * @param keyIdentifier the keyIdentifier value to set.
     * @return the KeyVaultProperties object itself.
     */
    public KeyVaultProperties withKeyIdentifier(String keyIdentifier) {
        this.keyIdentifier = keyIdentifier;
        return this;
    }

    /**
     * Get the identityClientId property: For future use - The client id of the identity which will be used to access
     * key vault.
     *
     * @return the identityClientId value.
     */
    public String identityClientId() {
        return this.identityClientId;
    }

    /**
     * Set the identityClientId property: For future use - The client id of the identity which will be used to access
     * key vault.
     *
     * @param identityClientId the identityClientId value to set.
     * @return the KeyVaultProperties object itself.
     */
    public KeyVaultProperties withIdentityClientId(String identityClientId) {
        this.identityClientId = identityClientId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keyVaultArmId() == null) {
            throw logger.logExceptionAsError(
                new IllegalArgumentException("Missing required property keyVaultArmId in model KeyVaultProperties"));
        }
        if (keyIdentifier() == null) {
            throw logger.logExceptionAsError(
                new IllegalArgumentException("Missing required property keyIdentifier in model KeyVaultProperties"));
        }
    }
}
