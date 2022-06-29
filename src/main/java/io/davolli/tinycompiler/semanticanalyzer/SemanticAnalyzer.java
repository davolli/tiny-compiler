package io.davolli.tinycompiler.semanticanalyzer;

import io.davolli.tinycompiler.semanticanalyzer.model.SemanticResult;
import io.davolli.tinycompiler.syntaxanalyzer.model.SyntaxTreeResult;

public class SemanticAnalyzer {

    private static final SemanticAnalyzer uniqueInstance = new SemanticAnalyzer();

    public static SemanticAnalyzer getInstance() {
        return uniqueInstance;
    }

    public SemanticResult execute(SyntaxTreeResult syntaxTreeResult) {
        return new SemanticResult();
    }

}
