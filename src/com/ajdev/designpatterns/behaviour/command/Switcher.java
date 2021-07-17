package com.ajdev.designpatterns.behaviour.command;

import java.util.ArrayList;
import java.util.List;

public class Switcher {
	public List<Command> commands;
	
	public Switcher() {
		this.commands = new ArrayList<Command>();
	}
	
	public void execute() {
		for (Command command : commands) {
			command.execute();
		}
	}
	
	public void addCommands(Command command) {
		this.commands.add(command);
	}
	

}
