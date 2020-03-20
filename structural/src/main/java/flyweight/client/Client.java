package flyweight.client;

import flyweight.factory.PenFactory;
import flyweight.pen.Pen;

public class Client {

    private static final String[] COLORS = {"Black", "White"};

    public static void main(String[] args) {

        for (int i = 0; i < 5; ++i) {
            Pen smallPen = PenFactory.getSmallPen(getRandomColor());
            smallPen.draw();
        }

        System.out.println(">>>>> COUNT: " + PenFactory.getPensCount());

        for (int i = 0; i < 5; ++i) {
            Pen mediumPen = PenFactory.getMediumPen(getRandomColor());
            mediumPen.draw();
        }

        System.out.println(">>>>> COUNT: " + PenFactory.getPensCount());

        for (int i = 0; i < 5; ++i) {
            Pen largePen = PenFactory.getLargePen(getRandomColor());
            largePen.draw();
        }

        System.out.println(">>>>> COUNT: " + PenFactory.getPensCount());
    }

    private static String getRandomColor() {

        return COLORS[(int) (Math.random() * COLORS.length)];
    }
}
