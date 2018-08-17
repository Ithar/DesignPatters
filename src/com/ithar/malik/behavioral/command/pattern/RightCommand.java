package com.ithar.malik.behavioral.command.pattern;


public class RightCommand implements Command {

	@Override
	public void execute() {
		System.out.println("Turn Right");
	}

}
