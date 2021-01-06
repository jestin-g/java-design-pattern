package visitor.examples.classic;

public interface Expression {
    public abstract void accept(ExpressionVisitor visitor);
}
