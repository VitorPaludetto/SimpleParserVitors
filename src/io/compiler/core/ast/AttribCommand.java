package io.compiler.core.ast;

public class AttribCommand extends Command {

    private String varId;
    private String expression;

    public AttribCommand(String varId, String expression) {
        this.varId = varId;
        this.expression = expression;
    }

    public String getVarId() {
        return varId;
    }

    public void setVarId(String varId) {
        this.varId = varId;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public String generateTarget() {
        return varId + " = " + expression + ";\n";
    }
}
