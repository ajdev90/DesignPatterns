package com.ajdev.designpatterns.structural.decorator;

public class BrownSugar extends BeverageDecorator {

	private Beverage beverage;

	public BrownSugar(Beverage beverage) {
		super(beverage);
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + " Sugar";
	}

	@Override
	public int getCost() {
		return this.beverage.getCost() + 1;
	}

}
