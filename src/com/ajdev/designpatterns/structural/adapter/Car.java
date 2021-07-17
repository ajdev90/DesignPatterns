package com.ajdev.designpatterns.structural.adapter;

public class Car implements Vehicle {

	@Override
	public void acclerate() {
		System.out.println("Car is acclerating");
	}

}
