package state.control;

import state.domin.TV;

public class RemoteControlOn implements RemoteControl {

    @Override
    public void pressSwitch(TV context) {
        System.out.println("Turning TV 'OFF'");
        context.setState(new RemoteControlOff());
    }

    @Override
    public String toString() {
        return "TV ON";
    }
}
