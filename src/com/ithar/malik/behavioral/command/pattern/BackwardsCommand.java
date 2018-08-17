package com.ithar.malik.behavioral.command.pattern;

public class BackwardsCommand implements Command {

	@Override
	public void execute() {
		System.out.println("Move Backwards");
	}

}
