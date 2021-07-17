package com.ajdev.designpatterns.behaviour.command;

public class TurnedOnCommand implements Command {

	private Light light;

	public TurnedOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		this.light.turnOn();
	}

}
