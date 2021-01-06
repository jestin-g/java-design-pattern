package visitor.examples.classic;

public class ExpressionCalculator implements ExpressionVisitor {

    private double result;

    @Override
    public void visit(DoubleExpression e) {
        result = e.getValue();
    }

    @Override
    public void visit(AdditionExpression e) {
        e.getLeft().accept(this);
        double a = result;
        e.getRight().accept(this);
        double b = result;
        result = a + b;
    }

    public double getResult() {
        return result;
    }

}
