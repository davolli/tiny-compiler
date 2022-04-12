package io.davolli.tinycompiler.lexicalanalyzer.verifier;

import io.davolli.tinycompiler.lexicalanalyzer.model.Token;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class DivisionSignVerifierTest {
    @Test
    void shouldReturnTrue_when_insertDivisionSignInput() {

        var verifierResponse = new DivisionSignVerifier().checkValidation('/', List.of(new Token()));

        Assertions.assertTrue(verifierResponse);
    }

    @Test
    void shouldReturnFalse_when_insertMinusInput() {

        var verifierResponse = new DivisionSignVerifier().checkValidation('-', List.of(new Token()));

        Assertions.assertFalse(verifierResponse);
    }
}
