package state.examples.classic;

public class LightSwitch {

    private State state; // OnState, OffState

    public LightSwitch() {
        this.state = new OffState();
    }

    public void on() {
        this.state.on(this);
    }

    public void off() {
        this.state.off(this);
    }

    public void setState(State state) {
        this.state = state;
    }
}
