package factory.original.factories;

import factory.original.shapes.Rectangle;
import factory.original.shapes.Shape;

public class RectangleFactory extends AbstractShapeFactor {

    @Override
    public Shape shapeFactory() {
        return new Rectangle();
    }

}
