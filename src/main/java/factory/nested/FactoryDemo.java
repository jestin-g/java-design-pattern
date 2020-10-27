package factory.nested;

class FactoryDemo {
    public static void main(String[] args) {
        Point point1 = Point.Factory.newCartesianPoint(1, 2);
        Point point2 = Point.Factory.newPolarPoint(7, 5);
    }
}
