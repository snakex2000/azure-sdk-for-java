// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Access Control List Patch Properties defines the patchable resource properties. */
@Fluent
public class AccessControlListPatchableProperties {
    /*
     * Input method to configure Access Control List.
     */
    @JsonProperty(value = "configurationType")
    private ConfigurationType configurationType;

    /*
     * Access Control List file URL.
     */
    @JsonProperty(value = "aclsUrl")
    private String aclsUrl;

    /*
     * List of match configurations.
     */
    @JsonProperty(value = "matchConfigurations")
    private List<AccessControlListMatchConfiguration> matchConfigurations;

    /*
     * List of dynamic match configurations.
     */
    @JsonProperty(value = "dynamicMatchConfigurations")
    private List<CommonDynamicMatchConfiguration> dynamicMatchConfigurations;

    /** Creates an instance of AccessControlListPatchableProperties class. */
    public AccessControlListPatchableProperties() {
    }

    /**
     * Get the configurationType property: Input method to configure Access Control List.
     *
     * @return the configurationType value.
     */
    public ConfigurationType configurationType() {
        return this.configurationType;
    }

    /**
     * Set the configurationType property: Input method to configure Access Control List.
     *
     * @param configurationType the configurationType value to set.
     * @return the AccessControlListPatchableProperties object itself.
     */
    public AccessControlListPatchableProperties withConfigurationType(ConfigurationType configurationType) {
        this.configurationType = configurationType;
        return this;
    }

    /**
     * Get the aclsUrl property: Access Control List file URL.
     *
     * @return the aclsUrl value.
     */
    public String aclsUrl() {
        return this.aclsUrl;
    }

    /**
     * Set the aclsUrl property: Access Control List file URL.
     *
     * @param aclsUrl the aclsUrl value to set.
     * @return the AccessControlListPatchableProperties object itself.
     */
    public AccessControlListPatchableProperties withAclsUrl(String aclsUrl) {
        this.aclsUrl = aclsUrl;
        return this;
    }

    /**
     * Get the matchConfigurations property: List of match configurations.
     *
     * @return the matchConfigurations value.
     */
    public List<AccessControlListMatchConfiguration> matchConfigurations() {
        return this.matchConfigurations;
    }

    /**
     * Set the matchConfigurations property: List of match configurations.
     *
     * @param matchConfigurations the matchConfigurations value to set.
     * @return the AccessControlListPatchableProperties object itself.
     */
    public AccessControlListPatchableProperties
        withMatchConfigurations(List<AccessControlListMatchConfiguration> matchConfigurations) {
        this.matchConfigurations = matchConfigurations;
        return this;
    }

    /**
     * Get the dynamicMatchConfigurations property: List of dynamic match configurations.
     *
     * @return the dynamicMatchConfigurations value.
     */
    public List<CommonDynamicMatchConfiguration> dynamicMatchConfigurations() {
        return this.dynamicMatchConfigurations;
    }

    /**
     * Set the dynamicMatchConfigurations property: List of dynamic match configurations.
     *
     * @param dynamicMatchConfigurations the dynamicMatchConfigurations value to set.
     * @return the AccessControlListPatchableProperties object itself.
     */
    public AccessControlListPatchableProperties
        withDynamicMatchConfigurations(List<CommonDynamicMatchConfiguration> dynamicMatchConfigurations) {
        this.dynamicMatchConfigurations = dynamicMatchConfigurations;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (matchConfigurations() != null) {
            matchConfigurations().forEach(e -> e.validate());
        }
        if (dynamicMatchConfigurations() != null) {
            dynamicMatchConfigurations().forEach(e -> e.validate());
        }
    }
}
