package com.ithar.malik.behavioral.command.pattern;


public class ForwardsCommand implements Command {

	@Override
	public void execute() {
		System.out.println("Move Forwards");
	}

}
