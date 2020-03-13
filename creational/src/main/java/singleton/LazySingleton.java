package singleton;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LazySingleton {

    private static LazySingleton INSTANCE = null;
    private String data;

    private LazySingleton() {}

    public static LazySingleton getInstance() {

        if (INSTANCE == null) {
            INSTANCE =  new LazySingleton();
        }

        return INSTANCE;
    }

}
