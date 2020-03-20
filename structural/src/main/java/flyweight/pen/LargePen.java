package flyweight.pen;

public class LargePen implements Pen {

    private PenType type = PenType.LARGE; // Intrinsic data
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
