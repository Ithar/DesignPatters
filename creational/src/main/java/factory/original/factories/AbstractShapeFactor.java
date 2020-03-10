package factory.original.factories;

import factory.original.shapes.Shape;

public abstract class AbstractShapeFactor {

    public abstract Shape shapeFactory();

    public Shape getShape() {
        return shapeFactory();
    }

}
