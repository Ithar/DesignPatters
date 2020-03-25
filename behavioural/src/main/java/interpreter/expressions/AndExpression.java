package interpreter.expressions;

public class AndExpression implements Expression {

    private Expression expr1;
    private Expression expr2;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpreter(String con) {
        return expr1.interpreter(con) && expr2.interpreter(con);
    }
}
