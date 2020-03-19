package bridge.shape;

import bridge.colour.Colour;

public class SquareShape extends Shape {

    public SquareShape(Colour colour) {
        super(colour);
    }

    @Override
    public void draw() {
        System.out.println("This SQUARE  has a '" + colour.getColour() + "' colour.");
    }
}
