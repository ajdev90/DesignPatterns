package com.ajdev.designpatterns.creation.abstractfactory;

public class ElectricToyota implements Car {

	@Override
	public void assembleCar() {
		System.out.println("Assembling electric toyota");
	}

}
