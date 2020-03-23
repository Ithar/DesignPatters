package state.domin;

import state.control.RemoteControl;

public class TV {

    private RemoteControl state;

    public TV(RemoteControl state) {
        this.state=state;
    }

    public void setState(RemoteControl state) {
        this.state = state;
    }

    public void pressButton() {
        state.pressSwitch(this);
    }

    @Override
    public String toString() {
        return "TV{" +
                "state=" + state +
                '}';
    }
}
