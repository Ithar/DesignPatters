package flyweight.factory;

import flyweight.pen.*;

import java.util.HashMap;
import java.util.Map;

public class PenFactory {

    private static Map<String, Pen> PENS = new HashMap<>();

    public static int getPensCount() {
        return PENS.size();
    }

    public static Pen getSmallPen(String colour) {

        String key = getKey(PenType.SMALL,colour);

        if (PENS.containsKey(key)) {
            return PENS.get(key);
        }

        Pen pen = new SmallPen();
        pen.setColour(colour);
        PENS.put(key, pen);
        return pen;
    }

    public static Pen getMediumPen(String colour) {

        String key = getKey(PenType.MEDIUM,colour);

        if (PENS.containsKey(key)) {
            return PENS.get(key);
        }

        Pen pen = new MediumPen();
        pen.setColour(colour);
        PENS.put(key, pen);
        return pen;
    }

    public static Pen getLargePen(String colour) {

        String key = getKey(PenType.LARGE,colour);

        if (PENS.containsKey(key)) {
            return PENS.get(key);
        }

        Pen pen = new LargePen();
        pen.setColour(colour);
        PENS.put(key, pen);
        return pen;
    }

    private static String getKey(PenType type, String colour) {
        return type.name()+ ":" + colour;
    }
}
