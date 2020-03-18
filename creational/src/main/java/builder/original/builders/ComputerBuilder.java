package builder.original.builders;

import builder.original.product.Computer;

public interface ComputerBuilder {

    void setOS();
    void setModel();
    void setHardDiskDrive();
    void setRandomAccessMemory();
    void setGraphicsCardEnabled();
    void setBluetoothEnabled();

    Computer getComputer();
}
