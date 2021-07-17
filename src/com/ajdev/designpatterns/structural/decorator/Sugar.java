package com.ajdev.designpatterns.structural.decorator;

public class Sugar extends BeverageDecorator {

	
	private Beverage beverage; 
	public Sugar(Beverage beverage) {
		super(beverage);
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + "Brown Sugar";
	}

	@Override
	public int getCost() {
		return this.beverage.getCost() + 2;
	}

}
