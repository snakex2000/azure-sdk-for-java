// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

/**
 * Actual state.
 */
public enum ActualState {
    /**
     * Enum value Enabling.
     */
    ENABLING("Enabling"),

    /**
     * Enum value Enabled.
     */
    ENABLED("Enabled"),

    /**
     * Enum value Disabling.
     */
    DISABLING("Disabling"),

    /**
     * Enum value Disabled.
     */
    DISABLED("Disabled"),

    /**
     * Enum value Unknown.
     */
    UNKNOWN("Unknown");

    /**
     * The actual serialized value for a ActualState instance.
     */
    private final String value;

    ActualState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ActualState instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed ActualState object, or null if unable to parse.
     */
    public static ActualState fromString(String value) {
        if (value == null) {
            return null;
        }
        ActualState[] items = ActualState.values();
        for (ActualState item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return this.value;
    }
}
