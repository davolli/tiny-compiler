package io.davolli.tinycompiler.lexicalanalyzer.verifier;

import io.davolli.tinycompiler.lexicalanalyzer.model.Token;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SpaceVerifierTest {
    @Test
    void shouldReturnTrue_whe_insertSpaceInput() {
        var verifierResponse = new SpaceVerifier().checkValidation(' ', List.of(new Token()));

        Assertions.assertTrue(verifierResponse);
    }

    @Test
    void shouldReturnFalse_whe_insertMinusInput() {
        var verifierResponse = new SpaceVerifier().checkValidation('-', List.of(new Token()));

        Assertions.assertFalse(verifierResponse);
    }
}
