package composite.examples.geometricShapes;

public class CompositeDemo {
    public static void main(String[] args) {
        GraphicObject drawing = new GraphicObject();
        drawing.setName("My Drawing");
        drawing.children.add(new Square("red"));
        drawing.children.add(new Circle("yellow"));

        GraphicObject group = new GraphicObject();
        group.children.add(new Circle("blue"));
        group.children.add(new Square("blue"));
        drawing.children.add(group);

        System.out.println(drawing);
    }
}
