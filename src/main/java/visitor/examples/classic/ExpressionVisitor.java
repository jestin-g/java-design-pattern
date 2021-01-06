package visitor.examples.classic;

public interface ExpressionVisitor {
    void visit(DoubleExpression e);
    void visit(AdditionExpression e);
}
