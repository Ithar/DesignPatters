package command.commands;

import command.domain.Robot;

public class RotateRightCommand implements Command {

    private Robot robot;

    public RotateRightCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        System.out.println("Rotate 'RIGHT'");

        if ("N".equals(robot.getDirection())) {
            robot.setDirection("E");
        } else if ("E".equals(robot.getDirection())) {
            robot.setDirection("S");
        } else if ("S".equals(robot.getDirection())) {
            robot.setDirection("W");
        } else if ("W".equals(robot.getDirection())) {
            robot.setDirection("N");
        }
    }
}
