package state.examples.classic;

public class State {

    public void on(LightSwitch ls) {
        System.out.println("Light is already on");
    }

    public void off(LightSwitch ls) {
        System.out.println("Light is already off");
    }

}
