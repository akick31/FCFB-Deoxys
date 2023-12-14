package com.fcfb.fcfb_deoxys.utils;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class ReplaceEnDashDeserializer extends JsonDeserializer<String> {

    @Override
    public String deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
            throws IOException {
        String value = jsonParser.getValueAsString();
        if (value != null && value.contains("–")) {
            // Replace en-dash with hyphen
            value = value.replace("–", "-");
        }
        return value;
    }
}
