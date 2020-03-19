package decarator.decarators;

import decarator.Icecream;

public class HoneyDecorator extends IcecreamDecorator {

    private Icecream icecream;

    public HoneyDecorator(Icecream icecream) {
        super(icecream);
    }

    @Override
    public void makeIcecream() {
        super.makeIcecream();
        System.out.println("Adding honey");
    }
}
