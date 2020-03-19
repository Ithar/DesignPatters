package decarator.decarators;

import decarator.Icecream;

public abstract class IcecreamDecorator implements Icecream {

    Icecream icecream;

    public IcecreamDecorator(Icecream icecream) {
        this.icecream = icecream;
    }

    public void makeIcecream() {
        icecream.makeIcecream();
    }

}
