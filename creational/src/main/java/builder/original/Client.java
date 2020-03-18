package builder.original;

import builder.original.builders.AppleComputerBuilder;
import builder.original.builders.ComputerBuilder;
import builder.original.builders.WindowsComputerBuilder;
import builder.original.director.BuilderDirector;
import builder.original.product.Computer;

public class Client {

    public static void main(String[] args) {

        BuilderDirector director = new BuilderDirector();

        ComputerBuilder appleBuilder = new AppleComputerBuilder();
        director.construct(appleBuilder);
        Computer apple = appleBuilder.getComputer();

        System.out.println(apple.toString());

        System.out.println();

        ComputerBuilder windowsBuilder = new WindowsComputerBuilder();
        director.construct(windowsBuilder);
        Computer windows = windowsBuilder.getComputer();
        System.out.println(windows.toString());
    }
}
