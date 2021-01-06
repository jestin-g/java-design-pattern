package visitor.examples.classic;

public interface Expression {
    void accept(ExpressionVisitor visitor);
}