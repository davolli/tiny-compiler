package io.davolli.tinycompiler.syntaxanalyzer.model;

import java.util.ArrayList;
import java.util.List;

public class Body {

    private String type;
    private String name;
    private List<Params> params = new ArrayList<>();

    public String getName() {
        return name;
    }

    public Body setName(String name) {
        this.name = name;
        return this;
    }

    public List<Params> getParams() {
        return params;
    }

    public Body setParams(List<Params> params) {
        this.params = params;
        return this;
    }

    public String getType() {
        return type;
    }

    public Body setType(String type) {
        this.type = type;
        return this;
    }
}
