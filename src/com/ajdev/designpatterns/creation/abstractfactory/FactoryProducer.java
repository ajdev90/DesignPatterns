package com.ajdev.designpatterns.creation.abstractfactory;

public class FactoryProducer {

	public static AbstractFactory GetFactory(FUEL_TYPE type) {
		if (type == FUEL_TYPE.ELECTRIC)
			return new ElectricFactory();
		else if (type == FUEL_TYPE.PETROL)
			return new PetrolFactory();
		else
			return null;
	}

}
