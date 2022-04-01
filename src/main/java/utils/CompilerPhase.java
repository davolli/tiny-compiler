package utils;

import java.util.List;

public abstract class CompilerPhase {

    public abstract List<Token> execute(String code);
}
