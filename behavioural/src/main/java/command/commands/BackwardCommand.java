package command.commands;

import command.domain.Robot;

public class BackwardCommand implements Command {

    private Robot robot;

    public BackwardCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        System.out.println("Move 'BACKWARD'");

        if ("N".equals(robot.getDirection())) {
            robot.setYPosition(robot.getYPosition() - 1);
        } else if ("E".equals(robot.getDirection())) {
            robot.setXPosition(robot.getXPosition() - 1);
        } else if ("S".equals(robot.getDirection())) {
            robot.setYPosition(robot.getYPosition() + 1);
        } else if ("W".equals(robot.getDirection())) {
            robot.setXPosition(robot.getXPosition() + 1);
        }
    }
}
