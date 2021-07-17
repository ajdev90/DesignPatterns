package com.ajdev.designpatterns.creation.abstractfactory;

public class ElectricFord implements Car {

	@Override
	public void assembleCar() {
		System.out.println("Assembling electric ford");
	}

}
