package builder.original.builders;

import builder.original.product.Computer;

public class AppleComputerBuilder implements ComputerBuilder {

    private Computer computer;

    public AppleComputerBuilder() {
        computer = new Computer();
    }

    @Override
    public void setOS() {
        this.computer.setOs("Apple Mac");
    }

    @Override
    public void setModel() {
        computer.setModel("a1278");
    }

    @Override
    public void setHardDiskDrive() {
        computer.setHDD(1.6);
    }

    @Override
    public void setRandomAccessMemory() {
        computer.setRAM(1024);
    }

    @Override
    public void setGraphicsCardEnabled() {
        computer.setGraphicsCardEnabled(true);
    }

    @Override
    public void setBluetoothEnabled() {
        computer.setBluetoothEnabled(false);
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
