package io.davolli.tinycompiler.syntaxanalyzer.model;

import java.util.ArrayList;
import java.util.List;

public class Body {

    private String type;
    private String name;
    private List<Param> params = new ArrayList<>();

    public String getName() {
        return name;
    }

    public Body setName(String name) {
        this.name = name;
        return this;
    }

    public List<Param> getParams() {
        return params;
    }

    public Body(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public Body addParam(Param param) {
        this.params.add(param);
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
