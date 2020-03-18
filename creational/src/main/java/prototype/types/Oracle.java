package prototype.types;

import prototype.DummyDriver;

public class Oracle implements Database {

    private String name;
    private DummyDriver driver;

    public Oracle(String name, DummyDriver driver) {
        this.name = name;
        this.driver = driver;
    }

    @Override
    public Database clone() throws CloneNotSupportedException {
        return (Oracle) super.clone();
    }

    @Override
    public String toString() {
        return "Oracle{" +
                "name='" + name + '\'' +
                ", driver=" + driver.getPort() +
                '}';
    }
}
