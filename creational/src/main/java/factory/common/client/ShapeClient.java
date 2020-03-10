package factory.common.client;

import factory.common.factory.ShapeFactory;
import factory.common.factory.StaticShapeFactory;
import factory.common.shapes.Shape;
import factory.common.type.ShapeType;

public class ShapeClient {

    public static void main(String[] args) throws Exception {

        Shape circle = new ShapeFactory().getShape(ShapeType.CIRCLE);
        circle.draw();

        Shape rectangle = new ShapeFactory().getShape(ShapeType.RECTANGLE);
        rectangle.draw();

        Shape square = new ShapeFactory().getShape(ShapeType.SQUARE);
        square.draw();

        // The static method implementation
        System.out.println("\n\n");

        Shape circle2 = StaticShapeFactory.getShape(ShapeType.CIRCLE);
        circle2.draw();

        Shape rectangle2 = StaticShapeFactory.getShape(ShapeType.RECTANGLE);
        rectangle2.draw();

        Shape square2 = StaticShapeFactory.getShape(ShapeType.SQUARE);
        square2.draw();
    }
}