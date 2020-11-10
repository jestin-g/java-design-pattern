package state.examples.classic;

public class BrokenState extends State {

    public BrokenState() {
        System.out.println("Light just got broken");
    }
    @Override
    public void on(LightSwitch ls) {
        System.out.println("Light is broken, can't turn on");
    }

    @Override
    public void off(LightSwitch ls) {
        System.out.println("Light is broken, can't turn off");
    }

    @Override
    public void fix(LightSwitch ls) {
        System.out.println("Fixing light...");
        ls.setState(new OffState());
    }
}
