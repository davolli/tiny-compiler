package io.davolli.tinycompiler;

import io.davolli.tinycompiler.lexicalanalyzer.LexicalAnalyzer;
import io.davolli.tinycompiler.syntaxanalyzer.SyntaxAnalyzer;


public class TinyCompiler {

    public static void main(String[] args) {
        final String code = "  //as  (1 \n 12/((5-1)*  2) +2";
        var lexicalAnalyzerResultTokenList = LexicalAnalyzer.execute(code);
        var syntaxTreeResponse = SyntaxAnalyzer.getInstance().setTokenList(lexicalAnalyzerResultTokenList)
                .execute();
    }
}
