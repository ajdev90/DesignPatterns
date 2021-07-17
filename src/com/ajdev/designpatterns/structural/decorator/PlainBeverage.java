package com.ajdev.designpatterns.structural.decorator;

public class PlainBeverage implements Beverage {

	
	
	@Override
	public int getCost() {

		return 0;
	}

	@Override
	public String getDescription() {

		return "Plain beverage";
	}

}
