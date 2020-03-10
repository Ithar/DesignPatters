package factory.common.factory;

import factory.common.type.ShapeType;
import factory.common.shapes.Circle;
import factory.common.shapes.Rectangle;
import factory.common.shapes.Shape;
import factory.common.shapes.Square;

public class ShapeFactory {

    public Shape getShape(ShapeType type) throws Exception {

        switch (type) {
            case CIRCLE:
                return new Circle();
            case SQUARE:
                return new Square();
            case RECTANGLE:
                return new Rectangle();
            default:
                throw new Exception("Type has no implementation.");
        }
    }
}
