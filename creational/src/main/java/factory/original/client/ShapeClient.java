package factory.original.client;

import factory.original.factories.CircleFactory;
import factory.original.factories.RectangleFactory;
import factory.original.factories.SquareFactory;
import factory.original.shapes.Shape;

public class ShapeClient {

    public static void main(String[] args) {

        Shape circle = new CircleFactory().getShape();
        circle.draw();

        Shape rectangle = new RectangleFactory().getShape();
        rectangle.draw();

        Shape square = new SquareFactory().getShape();
        square.draw();
    }
}