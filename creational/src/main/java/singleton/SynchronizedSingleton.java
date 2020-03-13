package singleton;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SynchronizedSingleton {

    private static SynchronizedSingleton INSTANCE = null;
    private String data;

    private SynchronizedSingleton() {}

    public static synchronized SynchronizedSingleton getInstance() {

        if (INSTANCE == null) {
            INSTANCE =  new SynchronizedSingleton();
        }

        return INSTANCE;
    }
}
