package visitor.examples.classic;

public class Demo {
    public static void main(String[] args) {
        // 1+(2+3)=6
        AdditionExpression e = new AdditionExpression(
                new DoubleExpression(1),
                new AdditionExpression(
                        new DoubleExpression(2),
                        new DoubleExpression(3)
                )
        );

        ExpressionPrinter ep = new ExpressionPrinter();
        ep.visit(e);
        System.out.println(ep);

        ExpressionCalculator ec = new ExpressionCalculator();
        ec.visit(e);
        System.out.println(ep + " = " + ec.getResult());

    }
}
