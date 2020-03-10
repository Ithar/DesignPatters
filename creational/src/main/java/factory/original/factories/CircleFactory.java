package factory.original.factories;

import factory.original.shapes.Circle;
import factory.original.shapes.Shape;

public class CircleFactory extends AbstractShapeFactor {

    @Override
    public Shape shapeFactory() {
        return new Circle();
    }

}
