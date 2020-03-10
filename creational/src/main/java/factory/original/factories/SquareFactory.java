package factory.original.factories;

import factory.original.shapes.Shape;
import factory.original.shapes.Square;

public class SquareFactory extends AbstractShapeFactor {

    @Override
    public Shape shapeFactory() {
        return new Square();
    }

}
