package builder.original.director;

import builder.original.builders.ComputerBuilder;

public class BuilderDirector {

    public void construct(ComputerBuilder builder) {
        builder.setOS();
        builder.setModel();
        builder.setHardDiskDrive();
        builder.setRandomAccessMemory();
        builder.setBluetoothEnabled();
        builder.setGraphicsCardEnabled();
    }

}
