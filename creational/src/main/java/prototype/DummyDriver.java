package prototype;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DummyDriver {

    private int port;
    private String property2;
    private String property3;

    public DummyDriver(int port) {
        this.port = port;
    }
}
