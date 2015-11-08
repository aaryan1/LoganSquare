package com.bluelinelabs.logansquare.processor;

import com.bluelinelabs.logansquare.JsonMapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

@SuppressWarnings("unsafe,unchecked")
public final class EnumModel$$JsonObjectMapper extends JsonMapper<EnumModel> {
    protected static final EnumModel.EnumTypeConverter ENUM_TYPE_CONVERTER = new EnumModel.EnumTypeConverter();

    @Override
    public EnumModel parse(JsonParser jsonParser) throws IOException {
        return null;
    }

    @Override
    public void parseField(EnumModel instance, String fieldName, JsonParser jsonParser) throws IOException {
        if ("enum".equals(fieldName)) {
            instance.myEnum = ENUM_TYPE_CONVERTER.parse(jsonParser);
        }
    }

    @Override
    public void serialize(EnumModel object, JsonGenerator jsonGenerator, boolean writeStartAndEnd) throws IOException {
        if (writeStartAndEnd) {
            jsonGenerator.writeStartObject();
        }
        ENUM_TYPE_CONVERTER.serialize(object.myEnum, "enum", true, jsonGenerator);
        if (writeStartAndEnd) {
            jsonGenerator.writeEndObject();
        }
    }
}