package io.davolli.tinycompiler;

import io.davolli.tinycompiler.lexicalanalyzer.LexicalAnalyzer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TinyCompiler {
    private static Logger LOGGER = LoggerFactory.getLogger(TinyCompiler.class);

    public static void main(String[] args) {
        final String code = "  //as  (1 \n 12/((1)+  1)   )";
        var lexicalAnalyzer = LexicalAnalyzer.execute(code);
    }
}
