package flyweight.pen;

public class SmallPen implements Pen {

    private PenType type = PenType.SMALL;
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
