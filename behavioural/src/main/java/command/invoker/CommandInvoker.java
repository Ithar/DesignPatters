package command.invoker;

import command.commands.Command;

import java.util.List;

public class CommandInvoker {

    private List<Command> commands;

    public CommandInvoker(List<Command> commands) {
        this.commands = commands;
    }

    public void doCommands(){

        for (Command command : commands) {
            command.execute();
        }


    }

}
