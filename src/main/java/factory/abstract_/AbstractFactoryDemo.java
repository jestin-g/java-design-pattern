package factory.abstract_;

public class AbstractFactoryDemo {
    public static void main(String[] args) throws Exception {
        HotDrinkMachine machine = new HotDrinkMachine();
        IHotDrink drink = machine.makeDrink();
        drink.consume();
    }
}