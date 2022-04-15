package io.davolli.tinycompiler.lexicalanalyzer.verifier;

import io.davolli.tinycompiler.lexicalanalyzer.model.Token;
import io.davolli.tinycompiler.lexicalanalyzer.model.TokenType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class InlineCommentVerifierTest {
    @Test
    void shouldReturnTrue_whe_insertInlineCommentsInputWithDivisionTokenBefore() {
        var verifierResponse = new InlineCommentVerifier().checkValidation('/',
                List.of(new Token(TokenType.DIVISION_SIGN, "/")));

        Assertions.assertTrue(verifierResponse);
    }

    @Test
    void shouldReturnFalse_whe_insertMinusInput() {
        var verifierResponse = new InlineCommentVerifier().checkValidation('-', List.of(new Token()));

        Assertions.assertFalse(verifierResponse);
    }
}
