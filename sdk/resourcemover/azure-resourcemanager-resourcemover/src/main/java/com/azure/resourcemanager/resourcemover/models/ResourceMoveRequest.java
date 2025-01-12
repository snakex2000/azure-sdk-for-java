// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Defines the request body for resource move operation. */
@Fluent
public final class ResourceMoveRequest {
    /*
     * Gets or sets a value indicating whether the operation needs to only run pre-requisite.
     */
    @JsonProperty(value = "validateOnly")
    private Boolean validateOnly;

    /*
     * Gets or sets the list of resource Id's, by default it accepts move resource id's unless the input type is
     * switched via moveResourceInputType property.
     */
    @JsonProperty(value = "moveResources", required = true)
    private List<String> moveResources;

    /*
     * Defines the move resource input type.
     */
    @JsonProperty(value = "moveResourceInputType")
    private MoveResourceInputType moveResourceInputType;

    /** Creates an instance of ResourceMoveRequest class. */
    public ResourceMoveRequest() {
    }

    /**
     * Get the validateOnly property: Gets or sets a value indicating whether the operation needs to only run
     * pre-requisite.
     *
     * @return the validateOnly value.
     */
    public Boolean validateOnly() {
        return this.validateOnly;
    }

    /**
     * Set the validateOnly property: Gets or sets a value indicating whether the operation needs to only run
     * pre-requisite.
     *
     * @param validateOnly the validateOnly value to set.
     * @return the ResourceMoveRequest object itself.
     */
    public ResourceMoveRequest withValidateOnly(Boolean validateOnly) {
        this.validateOnly = validateOnly;
        return this;
    }

    /**
     * Get the moveResources property: Gets or sets the list of resource Id's, by default it accepts move resource id's
     * unless the input type is switched via moveResourceInputType property.
     *
     * @return the moveResources value.
     */
    public List<String> moveResources() {
        return this.moveResources;
    }

    /**
     * Set the moveResources property: Gets or sets the list of resource Id's, by default it accepts move resource id's
     * unless the input type is switched via moveResourceInputType property.
     *
     * @param moveResources the moveResources value to set.
     * @return the ResourceMoveRequest object itself.
     */
    public ResourceMoveRequest withMoveResources(List<String> moveResources) {
        this.moveResources = moveResources;
        return this;
    }

    /**
     * Get the moveResourceInputType property: Defines the move resource input type.
     *
     * @return the moveResourceInputType value.
     */
    public MoveResourceInputType moveResourceInputType() {
        return this.moveResourceInputType;
    }

    /**
     * Set the moveResourceInputType property: Defines the move resource input type.
     *
     * @param moveResourceInputType the moveResourceInputType value to set.
     * @return the ResourceMoveRequest object itself.
     */
    public ResourceMoveRequest withMoveResourceInputType(MoveResourceInputType moveResourceInputType) {
        this.moveResourceInputType = moveResourceInputType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (moveResources() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property moveResources in model ResourceMoveRequest"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ResourceMoveRequest.class);
}
