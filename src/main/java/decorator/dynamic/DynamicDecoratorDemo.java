package decorator.dynamic;

import decorator.dynamic.base.Circle;
import decorator.dynamic.base.Square;

public class DynamicDecoratorDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println(circle.info());

        ColoredShape blueSquare = new ColoredShape(new Square(20), "blue");
        System.out.println(blueSquare.info());

        TransparentShape transparentGreenCircle = new TransparentShape(new ColoredShape(new Circle(5), "green"), 75);
        System.out.println(transparentGreenCircle.info());

        // transparentGreenCircle.resize() <- impossible
    }
}
