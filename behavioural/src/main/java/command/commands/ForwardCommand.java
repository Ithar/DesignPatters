package command.commands;

import command.domain.Robot;

public class ForwardCommand implements Command {

    private Robot robot;

    public ForwardCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        System.out.println("Move 'FORWARD'");

        if ("N".equals(robot.getDirection())) {
            robot.setYPosition(robot.getYPosition() + 1);
        } else if ("E".equals(robot.getDirection())) {
            robot.setXPosition(robot.getXPosition() + 1);
        } else if ("S".equals(robot.getDirection())) {
            robot.setYPosition(robot.getYPosition() - 1);
        } else if ("W".equals(robot.getDirection())) {
            robot.setXPosition(robot.getXPosition() - 1);
        }
    }
}
