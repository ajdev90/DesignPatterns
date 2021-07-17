package com.ajdev.designpatterns.creation.abstractfactory;

public class PetrolFactory implements AbstractFactory {

	@Override
	public Car getCar(CAR_TYPE type) {
		if (type == CAR_TYPE.FORD) {
			return new PetrolFord();
		} else if (type == CAR_TYPE.TOYOTA) {
			return new PetrolToyota();
		} else
			return null;
	}
}
