package state.examples.classic;

public class ClassicStateDemo {
    public static void main(String[] args) {
        LightSwitch lightSwitch = new LightSwitch();
        lightSwitch.on();
        lightSwitch.off();
        lightSwitch.off();
        lightSwitch.fix();
        lightSwitch.setState(new BrokenState());
        lightSwitch.fix();
        lightSwitch.on();
    }
}
