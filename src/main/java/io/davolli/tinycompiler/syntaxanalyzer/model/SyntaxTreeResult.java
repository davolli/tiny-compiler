package io.davolli.tinycompiler.syntaxanalyzer.model;

import java.util.ArrayList;
import java.util.List;

public class SyntaxTreeResult {

    private String type;

    private List<Body> body = new ArrayList<>();

    public String getType() {
        return type;
    }

    public SyntaxTreeResult setType(String type) {
        this.type = type;
        return this;
    }

    public List<Body> getBody() {
        return body;
    }

    public SyntaxTreeResult setBody(List<Body> body) {
        this.body = body;
        return this;
    }
}
