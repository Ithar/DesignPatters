package bridge.shape;

import bridge.colour.Colour;

public class TriangleShape extends Shape {

    public TriangleShape(Colour colour) {
        super(colour);
    }

    @Override
    public void draw() {
        System.out.println("This TRIANGLE  has a '" + colour.getColour() + "' colour.");
    }
}
