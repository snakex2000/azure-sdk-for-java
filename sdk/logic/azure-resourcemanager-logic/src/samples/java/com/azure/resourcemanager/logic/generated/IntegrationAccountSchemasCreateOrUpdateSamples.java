// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.logic.models.SchemaType;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for IntegrationAccountSchemas CreateOrUpdate.
 */
public final class IntegrationAccountSchemasCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/
     * IntegrationAccountSchemas_CreateOrUpdate.json
     */
    /**
     * Sample code: Create or update schema.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void createOrUpdateSchema(com.azure.resourcemanager.logic.LogicManager manager) throws IOException {
        manager.integrationAccountSchemas()
            .define("testSchema")
            .withRegion("westus")
            .withExistingIntegrationAccount("testResourceGroup", "testIntegrationAccount")
            .withSchemaType(SchemaType.XML)
            .withTags(mapOf("integrationAccountSchemaName", "IntegrationAccountSchema8120"))
            .withMetadata(SerializerFactory.createDefaultManagementSerializerAdapter()
                .deserialize("{}", Object.class, SerializerEncoding.JSON))
            .withContent(
                "<?xml version=\"1.0\" encoding=\"utf-16\"?>\r\n<xs:schema xmlns:b=\"http://schemas.microsoft.com/BizTalk/2003\" xmlns=\"http://Inbound_EDI.OrderFile\" targetNamespace=\"http://Inbound_EDI.OrderFile\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">\r\n  <xs:annotation>\r\n    <xs:appinfo>\r\n      <b:schemaInfo default_pad_char=\" \" count_positions_by_byte=\"false\" parser_optimization=\"speed\" lookahead_depth=\"3\" suppress_empty_nodes=\"false\" generate_empty_nodes=\"true\" allow_early_termination=\"false\" early_terminate_optional_fields=\"false\" allow_message_breakup_of_infix_root=\"false\" compile_parse_tables=\"false\" standard=\"Flat File\" root_reference=\"OrderFile\" />\r\n      <schemaEditorExtension:schemaInfo namespaceAlias=\"b\" extensionClass=\"Microsoft.BizTalk.FlatFileExtension.FlatFileExtension\" standardName=\"Flat File\" xmlns:schemaEditorExtension=\"http://schemas.microsoft.com/BizTalk/2003/SchemaEditorExtensions\" />\r\n    </xs:appinfo>\r\n  </xs:annotation>\r\n  <xs:element name=\"OrderFile\">\r\n    <xs:annotation>\r\n      <xs:appinfo>\r\n        <b:recordInfo structure=\"delimited\" preserve_delimiter_for_empty_data=\"true\" suppress_trailing_delimiters=\"false\" sequence_number=\"1\" />\r\n      </xs:appinfo>\r\n    </xs:annotation>\r\n    <xs:complexType>\r\n      <xs:sequence>\r\n        <xs:annotation>\r\n          <xs:appinfo>\r\n            <b:groupInfo sequence_number=\"0\" />\r\n          </xs:appinfo>\r\n        </xs:annotation>\r\n        <xs:element name=\"Order\">\r\n          <xs:annotation>\r\n            <xs:appinfo>\r\n              <b:recordInfo sequence_number=\"1\" structure=\"delimited\" preserve_delimiter_for_empty_data=\"true\" suppress_trailing_delimiters=\"false\" child_delimiter_type=\"hex\" child_delimiter=\"0x0D 0x0A\" child_order=\"infix\" />\r\n            </xs:appinfo>\r\n          </xs:annotation>\r\n          <xs:complexType>\r\n            <xs:sequence>\r\n              <xs:annotation>\r\n                <xs:appinfo>\r\n                  <b:groupInfo sequence_number=\"0\" />\r\n                </xs:appinfo>\r\n              </xs:annotation>\r\n              <xs:element name=\"Header\">\r\n                <xs:annotation>\r\n                  <xs:appinfo>\r\n                    <b:recordInfo sequence_number=\"1\" structure=\"delimited\" preserve_delimiter_for_empty_data=\"true\" suppress_trailing_delimiters=\"false\" child_delimiter_type=\"char\" child_delimiter=\"|\" child_order=\"infix\" tag_name=\"HDR|\" />\r\n                  </xs:appinfo>\r\n                </xs:annotation>\r\n                <xs:complexType>\r\n                  <xs:sequence>\r\n                    <xs:annotation>\r\n                      <xs:appinfo>\r\n                        <b:groupInfo sequence_number=\"0\" />\r\n                      </xs:appinfo>\r\n                    </xs:annotation>\r\n                    <xs:element name=\"PODate\" type=\"xs:string\">\r\n                      <xs:annotation>\r\n                        <xs:appinfo>\r\n                          <b:fieldInfo sequence_number=\"1\" justification=\"left\" />\r\n                        </xs:appinfo>\r\n                      </xs:annotation>\r\n                    </xs:element>\r\n                    <xs:element name=\"PONumber\" type=\"xs:string\">\r\n                      <xs:annotation>\r\n                        <xs:appinfo>\r\n                          <b:fieldInfo justification=\"left\" sequence_number=\"2\" />\r\n                        </xs:appinfo>\r\n                      </xs:annotation>\r\n                    </xs:element>\r\n                    <xs:element name=\"CustomerID\" type=\"xs:string\">\r\n                      <xs:annotation>\r\n                        <xs:appinfo>\r\n                          <b:fieldInfo sequence_number=\"3\" justification=\"left\" />\r\n                        </xs:appinfo>\r\n                      </xs:annotation>\r\n                    </xs:element>\r\n                    <xs:element name=\"CustomerContactName\" type=\"xs:string\">\r\n                      <xs:annotation>\r\n                        <xs:appinfo>\r\n                          <b:fieldInfo sequence_number=\"4\" justification=\"left\" />\r\n                        </xs:appinfo>\r\n                      </xs:annotation>\r\n                    </xs:element>\r\n                    <xs:element name=\"CustomerContactPhone\" type=\"xs:string\">\r\n                      <xs:annotation>\r\n                        <xs:appinfo>\r\n                          <b:fieldInfo sequence_number=\"5\" justification=\"left\" />\r\n                        </xs:appinfo>\r\n                      </xs:annotation>\r\n                    </xs:element>\r\n                  </xs:sequence>\r\n                </xs:complexType>\r\n              </xs:element>\r\n              <xs:element minOccurs=\"1\" maxOccurs=\"unbounded\" name=\"LineItems\">\r\n                <xs:annotation>\r\n                  <xs:appinfo>\r\n                    <b:recordInfo sequence_number=\"2\" structure=\"delimited\" preserve_delimiter_for_empty_data=\"true\" suppress_trailing_delimiters=\"false\" child_delimiter_type=\"char\" child_delimiter=\"|\" child_order=\"infix\" tag_name=\"DTL|\" />\r\n                  </xs:appinfo>\r\n                </xs:annotation>\r\n                <xs:complexType>\r\n                  <xs:sequence>\r\n                    <xs:annotation>\r\n                      <xs:appinfo>\r\n                        <b:groupInfo sequence_number=\"0\" />\r\n                      </xs:appinfo>\r\n                    </xs:annotation>\r\n                    <xs:element name=\"PONumber\" type=\"xs:string\">\r\n                      <xs:annotation>\r\n                        <xs:appinfo>\r\n                          <b:fieldInfo sequence_number=\"1\" justification=\"left\" />\r\n                        </xs:appinfo>\r\n                      </xs:annotation>\r\n                    </xs:element>\r\n                    <xs:element name=\"ItemOrdered\" type=\"xs:string\">\r\n                      <xs:annotation>\r\n                        <xs:appinfo>\r\n                          <b:fieldInfo sequence_number=\"2\" justification=\"left\" />\r\n                        </xs:appinfo>\r\n                      </xs:annotation>\r\n                    </xs:element>\r\n                    <xs:element name=\"Quantity\" type=\"xs:string\">\r\n                      <xs:annotation>\r\n                        <xs:appinfo>\r\n                          <b:fieldInfo sequence_number=\"3\" justification=\"left\" />\r\n                        </xs:appinfo>\r\n                      </xs:annotation>\r\n                    </xs:element>\r\n                    <xs:element name=\"UOM\" type=\"xs:string\">\r\n                      <xs:annotation>\r\n                        <xs:appinfo>\r\n                          <b:fieldInfo sequence_number=\"4\" justification=\"left\" />\r\n                        </xs:appinfo>\r\n                      </xs:annotation>\r\n                    </xs:element>\r\n                    <xs:element name=\"Price\" type=\"xs:string\">\r\n                      <xs:annotation>\r\n                        <xs:appinfo>\r\n                          <b:fieldInfo sequence_number=\"5\" justification=\"left\" />\r\n                        </xs:appinfo>\r\n                      </xs:annotation>\r\n                    </xs:element>\r\n                    <xs:element name=\"ExtendedPrice\" type=\"xs:string\">\r\n                      <xs:annotation>\r\n                        <xs:appinfo>\r\n                          <b:fieldInfo sequence_number=\"6\" justification=\"left\" />\r\n                        </xs:appinfo>\r\n                      </xs:annotation>\r\n                    </xs:element>\r\n                    <xs:element name=\"Description\" type=\"xs:string\">\r\n                      <xs:annotation>\r\n                        <xs:appinfo>\r\n                          <b:fieldInfo sequence_number=\"7\" justification=\"left\" />\r\n                        </xs:appinfo>\r\n                      </xs:annotation>\r\n                    </xs:element>\r\n                  </xs:sequence>\r\n                </xs:complexType>\r\n              </xs:element>\r\n            </xs:sequence>\r\n          </xs:complexType>\r\n        </xs:element>\r\n      </xs:sequence>\r\n    </xs:complexType>\r\n  </xs:element>\r\n</xs:schema>")
            .withContentType("application/xml")
            .create();
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
