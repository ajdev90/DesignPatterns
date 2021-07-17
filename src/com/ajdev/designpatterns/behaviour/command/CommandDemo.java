package com.ajdev.designpatterns.behaviour.command;

public class CommandDemo {

	public static void main(String[] args) {
		Switcher switcher = new Switcher();
		Light light = new Light();
		TurnedOnCommand command = new TurnedOnCommand(light);
		TurnedOffCommand command1 = new TurnedOffCommand(light);
		switcher.addCommands(command1);
		switcher.addCommands(command);
		switcher.execute();

	}

}
