package com.ajdev.designpatterns.creation.abstractfactory;

public class ElectricFactory implements AbstractFactory {

	@Override
	public Car getCar(CAR_TYPE type) {
		if (type == CAR_TYPE.FORD) {
			return new ElectricFord();
		} else if (type == CAR_TYPE.TOYOTA) {
			return new ElectricToyota();
		} else
			return null;
	}
}
