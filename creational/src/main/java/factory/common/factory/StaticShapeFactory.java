package factory.common.factory;

import factory.common.shapes.Circle;
import factory.common.shapes.Rectangle;
import factory.common.shapes.Shape;
import factory.common.shapes.Square;
import factory.common.type.ShapeType;

public class StaticShapeFactory {

    public static Shape getShape(ShapeType type) throws Exception {

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
