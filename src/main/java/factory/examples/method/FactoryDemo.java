package factory.examples.method;

class FactoryDemo {
    public static void main(String[] args) {
        Point point1 = Point.newPolarPoint(2, 3);
        Point point2 = Point.newCartesianPoint(15, 7);
    }
}