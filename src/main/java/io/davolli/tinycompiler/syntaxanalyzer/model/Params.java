package io.davolli.tinycompiler.syntaxanalyzer.model;

public class Params {

    private String type;

    private String value;

    public String getType() {
        return type;
    }

    public Params setType(String type) {
        this.type = type;
        return this;
    }

    public String getValue() {
        return value;
    }

    public Params setValue(String value) {
        this.value = value;
        return this;
    }
}
