package io.davolli.tinycompiler.lexicalanalyzer.verifier;

import io.davolli.tinycompiler.lexicalanalyzer.model.Token;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class NumberVerifierTest {
    @Test
    void shouldReturnTrue_whe_insertNumberInput() {
        var verifierResponse = new NumberVerify().checkValidation('0', List.of(new Token()));

        Assertions.assertTrue(verifierResponse);
    }

    @Test
    void shouldReturnFalse_whe_insertMinusInput() {
        var verifierResponse = new NumberVerify().checkValidation('-', List.of(new Token()));

        Assertions.assertFalse(verifierResponse);
    }
}
