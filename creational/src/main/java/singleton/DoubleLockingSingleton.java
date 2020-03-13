package singleton;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoubleLockingSingleton {

    private volatile static DoubleLockingSingleton INSTANCE = null;

    private String data;

    private DoubleLockingSingleton() {}

    public static DoubleLockingSingleton getInstance() {

        if (INSTANCE == null) {
            synchronized(DoubleLockingSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DoubleLockingSingleton();
                }
            }
        }

        return INSTANCE;
    }
}
