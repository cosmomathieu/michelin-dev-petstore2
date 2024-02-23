/*
 * SwaggerPetstoreOpenAPI30Lib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package io.swagger.petstore.models;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;


/**
 * OAuthScopePetstoreAuthEnum to be used.
 */
public enum OAuthScopePetstoreAuthEnum {
    /**
     * modify pets in your account
     */
    @javax.xml.bind.annotation.XmlEnumValue("write:pets")
    WRITEPETS,

    /**
     * read your pets
     */
    @javax.xml.bind.annotation.XmlEnumValue("read:pets")
    READPETS;


    private static TreeMap<String, OAuthScopePetstoreAuthEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        WRITEPETS.value = "write:pets";
        READPETS.value = "read:pets";

        valueMap.put("write:pets", WRITEPETS);
        valueMap.put("read:pets", READPETS);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static OAuthScopePetstoreAuthEnum constructFromString(String toConvert) throws IOException {
        OAuthScopePetstoreAuthEnum enumValue = fromString(toConvert);
        if (enumValue == null)
        {
            throw new IOException("Unable to create enum instance with value: " + toConvert);
        }
        return enumValue;
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    public static OAuthScopePetstoreAuthEnum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member.
     * @return The string value against enum member.
     */
    @JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of OAuthScopePetstoreAuthEnum values to list of string values.
     * @param toConvert The list of OAuthScopePetstoreAuthEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<OAuthScopePetstoreAuthEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (OAuthScopePetstoreAuthEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 