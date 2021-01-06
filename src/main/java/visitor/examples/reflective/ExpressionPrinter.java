package visitor.examples.reflective;

public class ExpressionPrinter {
    public static void print(Expression e, StringBuilder sb) {
        if (e.getClass() == DoubleExpression.class) {
            sb.append(((DoubleExpression)e).getValue());
        } else if (e.getClass() == AdditionExpression.class) {
            AdditionExpression ae = (AdditionExpression) e;
            sb.append("(");
            print(ae.getLeft(), sb);
            sb.append("+");
            print(ae.getRight(), sb);
            sb.append(")");
        }
    }
}
