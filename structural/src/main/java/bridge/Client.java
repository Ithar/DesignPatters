package bridge;

import bridge.colour.BlueColour;
import bridge.colour.RedColour;
import bridge.shape.Shape;
import bridge.shape.SquareShape;
import bridge.shape.TriangleShape;

public class Client {

    public static void main(String[] args) {

        Shape triangle = new TriangleShape(new RedColour());
        triangle.draw();

        triangle = new TriangleShape(new BlueColour());
        triangle.draw();

        Shape square = new SquareShape(new BlueColour());
        square.draw();
    }

}
