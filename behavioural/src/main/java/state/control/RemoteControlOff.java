package state.control;

import state.domin.TV;

public class RemoteControlOff implements RemoteControl {

    @Override
    public void pressSwitch(TV context) {
        System.out.println("Turning TV 'ON'");
        context.setState(new RemoteControlOn());
    }

    @Override
    public String toString() {
        return "TV: OFF";
    }
}
