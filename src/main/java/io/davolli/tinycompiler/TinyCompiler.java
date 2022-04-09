package io.davolli.tinycompiler;

import io.davolli.tinycompiler.lexicalanalyzer.LexicalAnalyzer;


public class TinyCompiler {

    public static void main(String[] args) {
        final String code = "  //as  (1 \n 12/((5-1+2)*  2)   )";
        var lexicalAnalyzer = LexicalAnalyzer.execute(code);
    }
}
