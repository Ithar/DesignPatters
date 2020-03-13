package singleton;

import lombok.Data;

@Data
public class StaticInnerSingleton {

    private String data;

    private StaticInnerSingleton() {
    }

    public static class StaticInnerSingletonHelper {
        private static final StaticInnerSingleton INSTANCE = new StaticInnerSingleton();
    }

    public static StaticInnerSingleton getInstance() {
        return StaticInnerSingletonHelper.INSTANCE;
    }

}