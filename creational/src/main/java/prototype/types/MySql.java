package prototype.types;

import lombok.Getter;
import lombok.Setter;
import prototype.DummyDriver;

@Getter
@Setter
public class MySql implements Database {

    private String name;
    private DummyDriver driver;

    public MySql(String name, DummyDriver driver) {
        this.name = name;
        this.driver = driver;
    }

    @Override
    public Database clone() throws CloneNotSupportedException {
        return (MySql) super.clone();
    }

    @Override
    public String toString() {
        return "MySql{" +
                "name='" + name + '\'' +
                ", driver=" + driver.getPort()
                +
                '}';
    }
}
