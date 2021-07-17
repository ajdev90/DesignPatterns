package com.ajdev.designpatterns.creation.abstractfactory;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		AbstractFactory factory = FactoryProducer.GetFactory(FUEL_TYPE.ELECTRIC);
		Car car = factory.getCar(CAR_TYPE.TOYOTA);
		car.assembleCar();
	}

}
