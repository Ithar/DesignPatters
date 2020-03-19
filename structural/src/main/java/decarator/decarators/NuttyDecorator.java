package decarator.decarators;

import decarator.Icecream;

public class NuttyDecorator extends IcecreamDecorator {

    private Icecream icecream;

    public NuttyDecorator(Icecream icecream) {
        super(icecream);
    }

    @Override
    public void makeIcecream() {
        super.makeIcecream();
        System.out.println("Adding nuts");
    }
}
