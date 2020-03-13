package singleton;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EagerSingleton {

    private final static EagerSingleton INSTANCE = new EagerSingleton();

    private String data;

    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }

}
