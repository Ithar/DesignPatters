package builder.original.builders;

import builder.original.product.Computer;

public class WindowsComputerBuilder implements ComputerBuilder {

    private Computer computer;

    public WindowsComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void setOS() {
        computer.setOs("Windows");
    }

    @Override
    public void setModel() {
        computer.setModel("64-bit");
    }

    @Override
    public void setHardDiskDrive() {
        computer.setHDD(2.5);
    }

    @Override
    public void setRandomAccessMemory() {
        computer.setRAM(2048);
    }

    @Override
    public void setGraphicsCardEnabled() {
        computer.setGraphicsCardEnabled(false);
    }

    @Override
    public void setBluetoothEnabled() {
        computer.setBluetoothEnabled(true);
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
