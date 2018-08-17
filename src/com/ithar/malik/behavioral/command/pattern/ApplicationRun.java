package com.ithar.malik.behavioral.command.pattern;

import java.util.ArrayList;
import java.util.List;


public class ApplicationRun {


	public static void main(String[] args) {
		
		Command command = null; 
		
		command = new LeftCommand();
		command.execute();
		
		command = new RightCommand();
		command.execute();
		
		command = new BackwardsCommand();
		command.execute();
		
		command = new ForwardsCommand();
		command.execute();
		
		doAction();
	}

	private static void doAction() {
		
		List<Command> commandList = new ArrayList<Command>();
		commandList.add(new LeftCommand());
		commandList.add(new RightCommand());
		commandList.add(new BackwardsCommand());
		commandList.add(new ForwardsCommand());
		
		System.out.println("### executing commands ######");
		for (Command command : commandList) {
			command.execute();
		}
		
		
	}
	
}
