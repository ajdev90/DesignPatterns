package com.ajdev.designpatterns.structural.decorator;

public class Application {
	public static void main(String[] args) {
		Beverage customBeverage = new Milk(new Sugar(new BrownSugar(new Milk(new PlainBeverage()))));
		System.out.println(customBeverage.getCost());
		System.out.println(customBeverage.getDescription());

	}
}
