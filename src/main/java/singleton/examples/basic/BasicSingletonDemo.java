package singleton.examples.basic;

public class BasicSingletonDemo {
    public static void main(String[] args) {
        BasicSingleton singleton = BasicSingleton.getInstance();
        singleton.setValue(7);
        System.out.println(singleton.getValue());
    }
}
