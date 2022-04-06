package io.davolli.tinycompiler;

import io.davolli.tinycompiler.lexicalanalyzer.LexicalAnalyzer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TinyCompiler {
    private static Logger LOGGER = LoggerFactory.getLogger(TinyCompiler.class);

    public static void main(String[] args) {
        final String code = "    ( 1 + 1   %n   )";
        var lexicalAnalyzer = LexicalAnalyzer.execute(code);
    }
}
