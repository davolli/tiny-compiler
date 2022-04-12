package io.davolli.tinycompiler.lexicalanalyzer.verifier;

import io.davolli.tinycompiler.lexicalanalyzer.model.Token;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class FinalVerifierTest {

    @Test
    void shouldEverReturnTrue_when_insertAnyInput() {

        var verifierResponse = new FinalVerifier().checkValidation('?', List.of(new Token()));

        Assertions.assertTrue(verifierResponse);
    }

}
