package decorator.dynamic.base;

public class Square implements Shape {

    private float side;

    public Square(float side) {
        this.side = side;
    }

    public Square() {
    }

    @Override
    public String info() {
        return "A square of side " + side;
    }
}
