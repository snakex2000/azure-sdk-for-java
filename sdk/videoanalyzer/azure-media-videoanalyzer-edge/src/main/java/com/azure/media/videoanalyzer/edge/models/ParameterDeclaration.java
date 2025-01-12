// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.videoanalyzer.edge.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Single topology parameter declaration. Declared parameters can and must be referenced throughout the topology and can
 * optionally have default values to be used when they are not defined in the pipeline instances.
 */
@Fluent
public final class ParameterDeclaration implements JsonSerializable<ParameterDeclaration> {
    /*
     * Name of the parameter.
     */
    private final String name;

    /*
     * Type of the parameter.
     */
    private final ParameterType type;

    /*
     * Description of the parameter.
     */
    private String description;

    /*
     * The default value for the parameter to be used if the live pipeline does not specify a value.
     */
    private String defaultProperty;

    /**
     * Creates an instance of ParameterDeclaration class.
     * 
     * @param name the name value to set.
     * @param type the type value to set.
     */
    public ParameterDeclaration(String name, ParameterType type) {
        this.name = name;
        this.type = type;
    }

    /**
     * Get the name property: Name of the parameter.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the type property: Type of the parameter.
     * 
     * @return the type value.
     */
    public ParameterType getType() {
        return this.type;
    }

    /**
     * Get the description property: Description of the parameter.
     * 
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: Description of the parameter.
     * 
     * @param description the description value to set.
     * @return the ParameterDeclaration object itself.
     */
    public ParameterDeclaration setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the defaultProperty property: The default value for the parameter to be used if the live pipeline does not
     * specify a value.
     * 
     * @return the defaultProperty value.
     */
    public String getDefaultProperty() {
        return this.defaultProperty;
    }

    /**
     * Set the defaultProperty property: The default value for the parameter to be used if the live pipeline does not
     * specify a value.
     * 
     * @param defaultProperty the defaultProperty value to set.
     * @return the ParameterDeclaration object itself.
     */
    public ParameterDeclaration setDefaultProperty(String defaultProperty) {
        this.defaultProperty = defaultProperty;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeStringField("default", this.defaultProperty);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ParameterDeclaration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ParameterDeclaration if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ParameterDeclaration.
     */
    public static ParameterDeclaration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean nameFound = false;
            String name = null;
            boolean typeFound = false;
            ParameterType type = null;
            String description = null;
            String defaultProperty = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    name = reader.getString();
                    nameFound = true;
                } else if ("type".equals(fieldName)) {
                    type = ParameterType.fromString(reader.getString());
                    typeFound = true;
                } else if ("description".equals(fieldName)) {
                    description = reader.getString();
                } else if ("default".equals(fieldName)) {
                    defaultProperty = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            if (nameFound && typeFound) {
                ParameterDeclaration deserializedParameterDeclaration = new ParameterDeclaration(name, type);
                deserializedParameterDeclaration.description = description;
                deserializedParameterDeclaration.defaultProperty = defaultProperty;

                return deserializedParameterDeclaration;
            }
            List<String> missingProperties = new ArrayList<>();
            if (!nameFound) {
                missingProperties.add("name");
            }
            if (!typeFound) {
                missingProperties.add("type");
            }

            throw new IllegalStateException(
                "Missing required property/properties: " + String.join(", ", missingProperties));
        });
    }
}
