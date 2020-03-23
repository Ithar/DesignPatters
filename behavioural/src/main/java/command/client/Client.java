package command.client;

import command.commands.Command;
import command.commands.ForwardCommand;
import command.commands.BackwardCommand;
import command.commands.RotateRightCommand;
import command.domain.Robot;
import command.invoker.CommandInvoker;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        Robot robot = new Robot(0,0, "N");

        Command rightCommand = new RotateRightCommand(robot);
        Command forwardCommand = new ForwardCommand(robot);
        Command backwardCommand = new BackwardCommand(robot);

        List<Command> commandList = new ArrayList<>();
        commandList.add(forwardCommand);
        commandList.add(forwardCommand);
        commandList.add(rightCommand);
        commandList.add(forwardCommand);
        commandList.add(forwardCommand);
        commandList.add(backwardCommand);

        CommandInvoker invoker = new CommandInvoker(commandList);
        invoker.doCommands();

        System.out.println(robot.toString());
    }
}
