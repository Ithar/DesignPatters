package state.client;

import state.control.RemoteControlOff;
import state.domin.TV;

public class Client {

    public static void main(String[] args) {

        RemoteControlOff initialState = new RemoteControlOff();

        TV tv = new TV(initialState);

        tv.pressButton();
        tv.pressButton();
        tv.pressButton();

        System.out.println(">>>> " +  tv.toString());
    }
}
