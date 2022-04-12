package io.davolli.tinycompiler.lexicalanalyzer.verifier;

import io.davolli.tinycompiler.lexicalanalyzer.model.Token;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class AddictionVerifierTest {

    @Test
    void shouldReturnTrue_when_insertPlusInput() {

        var verifierResponse = new AddictionVerifier().checkValidation('+', List.of(new Token()));

        Assertions.assertTrue(verifierResponse);
    }

    @Test
    void shouldReturnFalse_when_insertMinusInput() {

        var verifierResponse = new AddictionVerifier().checkValidation('-', List.of(new Token()));

        Assertions.assertFalse(verifierResponse);
    }
}
