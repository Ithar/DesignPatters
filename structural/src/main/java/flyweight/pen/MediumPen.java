package flyweight.pen;

public class MediumPen implements Pen {

    private PenType type = PenType.MEDIUM; // Intrinsic data
    private String colour;

    @Override
    public void draw() {
        System.out.println("Drawing '" + type.name() + "' " + colour + " pen.");
    }

    @Override
    public void setColour(String colour) {
        this.colour = colour;
    }
}
