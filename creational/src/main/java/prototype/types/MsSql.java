package prototype.types;

import lombok.Getter;
import lombok.Setter;
import prototype.DummyDriver;

@Getter
@Setter
public class MsSql implements Database {

    private String name;
    private DummyDriver driver;

    public MsSql(String name, DummyDriver driver) {
        this.name = name;
        this.driver = driver;
    }

    @Override
    public Database clone() throws CloneNotSupportedException {
        return (MsSql) super.clone();
    }

    @Override
    public String toString() {
        return "MsSql{" +
                "name='" + name + '\'' +
                ", driver=" + driver.getPort() +
                '}';
    }
}
