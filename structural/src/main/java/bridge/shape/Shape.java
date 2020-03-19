package bridge.shape;

import bridge.colour.Colour;

public abstract class Shape {

    public Colour colour;

    public Shape(Colour colour) {
        this.colour = colour;
    }

    public abstract void draw();
}
