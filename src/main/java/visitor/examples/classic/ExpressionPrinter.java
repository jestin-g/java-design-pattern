package visitor.examples.classic;

public class ExpressionPrinter implements ExpressionVisitor {

    private StringBuilder sb = new StringBuilder();

    @Override
    public void visit(DoubleExpression e) {
        sb.append(e.getValue());
    }

    @Override
    public void visit(AdditionExpression e) {
        sb.append("(");
        e.getLeft().accept(this);
        sb.append("+");
        e.getRight().accept(this);
        sb.append(")");
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}
