package io.davolli.tinycompiler;

import io.davolli.tinycompiler.lexicalanalyzer.LexicalAnalyzer;
import io.davolli.tinycompiler.semanticanalyzer.SemanticAnalyzer;
import io.davolli.tinycompiler.syntaxanalyzer.SyntaxAnalyzer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TinyCompiler {

    private static Logger LOGGER = LoggerFactory.getLogger(TinyCompiler.class);

    public static void main(String[] args) {
        final String code = "  //as  (1 \n 12/((5-1)*  2) +2  ";
        LOGGER.info("-----Lexical Analyzer---");
        var lexicalAnalyzerResultTokenList = LexicalAnalyzer.execute(code);
        LOGGER.info("-----Syntax Analyzer---");
        var syntaxTreeResponse = SyntaxAnalyzer.getInstance().setTokenList(lexicalAnalyzerResultTokenList)
                .execute();
        LOGGER.info("-----Semantic Analyzer---");
        var semanticResponse = SemanticAnalyzer.getInstance().execute(syntaxTreeResponse);

    }
}
