package builder.original.product;

import lombok.Data;

@Data
public class Computer {

    private String os;
    private String model;
    private double HDD;
    private int RAM;
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    @Override
    public String toString() {
        return "Computer{" +
                "os='" + os + '\'' +
                ", model='" + model + '\'' +
                ", HDD='" + HDD + '\'' +
                ", RAM=" + RAM +
                ", isGraphicsCardEnabled=" + isGraphicsCardEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }
}
