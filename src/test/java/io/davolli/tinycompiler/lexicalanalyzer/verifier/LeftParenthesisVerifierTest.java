package io.davolli.tinycompiler.lexicalanalyzer.verifier;

import io.davolli.tinycompiler.lexicalanalyzer.model.Token;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class LeftParenthesisVerifierTest {

    @Test
    void shouldReturnTrue_when_insertLeftParenthesisInput() {

        var verifierResponse = new LeftParenthesisVerifier().checkValidation('(', List.of(new Token()));

        Assertions.assertTrue(verifierResponse);
    }

    @Test
    void shouldReturnFalse_when_insertMinusInput() {

        var verifierResponse = new LeftParenthesisVerifier().checkValidation('-', List.of(new Token()));

        Assertions.assertFalse(verifierResponse);
    }
}
