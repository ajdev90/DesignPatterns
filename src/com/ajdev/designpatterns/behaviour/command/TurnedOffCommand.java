package com.ajdev.designpatterns.behaviour.command;

public class TurnedOffCommand implements Command{

	private Light light;

	public TurnedOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		this.light.turnOff();
	}

}
