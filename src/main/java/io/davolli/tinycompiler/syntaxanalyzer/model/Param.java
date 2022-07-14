package io.davolli.tinycompiler.syntaxanalyzer.model;

public class Param {

    private String type;

    private String value;

    public String getType() {
        return type;
    }

    public Param setType(String type) {
        this.type = type;
        return this;
    }

    public String getValue() {
        return value;
    }

    public Param setValue(String value) {
        this.value = value;
        return this;
    }
}
