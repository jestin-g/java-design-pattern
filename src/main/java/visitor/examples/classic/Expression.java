package visitor.examples.classic;

public abstract class Expression {
    public abstract void accept(ExpressionVisitor visitor);
}
