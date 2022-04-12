package io.davolli.tinycompiler.lexicalanalyzer;

import io.davolli.tinycompiler.lexicalanalyzer.model.Token;
import io.davolli.tinycompiler.lexicalanalyzer.model.TokenType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class LexicalAnalyzerTest {

    @Test
    void shouldReturnOnlyParenthesisTokens_when_CallLexicalAnalyzerWithParenthesesCode() {
        final String ONLY_PARENTHESIS_CODE = "()";
        ArrayList<Token> expectedList = new ArrayList<Token>();
        expectedList.add(new Token(TokenType.LEFT_PAREN, "("));
        expectedList.add(new Token(TokenType.RIGHT_PAREN, ")"));

        List<Token> resultLexicalTokenList = LexicalAnalyzer.execute(ONLY_PARENTHESIS_CODE);

        Assertions.assertEquals(resultLexicalTokenList.size(), expectedList.size());

        Assertions.assertEquals(resultLexicalTokenList.get(0).getTokenType(), expectedList.get(0).getTokenType());
        Assertions.assertEquals(resultLexicalTokenList.get(0).getValue(), expectedList.get(0).getValue());

        Assertions.assertEquals(resultLexicalTokenList.get(1).getTokenType(), expectedList.get(1).getTokenType());
        Assertions.assertEquals(resultLexicalTokenList.get(1).getValue(), expectedList.get(1).getValue());
    }
}
