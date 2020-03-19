package decarator;

import decarator.decarators.HoneyDecorator;
import decarator.decarators.NuttyDecorator;

public class Client {

    public static void main(String[] args) {

        Icecream icecream = new HoneyDecorator(new NuttyDecorator(new SimpleIcecream()));
        icecream.makeIcecream();

    }

}
