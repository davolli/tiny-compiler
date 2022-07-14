package io.davolli.tinycompiler.syntaxanalyzer.model;

import java.util.ArrayList;
import java.util.List;

public class SyntaxTreeResult {

    private String type;

    private List<Body> bodyList = new ArrayList<>();

    private Body actualBody;

    public String getType() {
        return type;
    }

    public SyntaxTreeResult() {
        this.type = "Program";
    }

    public SyntaxTreeResult setType(String type) {
        this.type = type;
        return this;
    }

    public void initNewBody(String type, String name) {
        this.actualBody = new Body(type, name);
    }
    public void finishBody() {
        this.bodyList.add(this.actualBody);
    }
    public void addParamToBody(Param param) {
        this.actualBody.addParam(param);
    }
}
