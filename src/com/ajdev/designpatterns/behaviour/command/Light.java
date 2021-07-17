package com.ajdev.designpatterns.behaviour.command;
//receiver
public class Light {
	public void turnOn() {
		System.out.println("Turned On");
	}

	public void turnOff() {
		System.out.println("Turned Off");
	}
}
