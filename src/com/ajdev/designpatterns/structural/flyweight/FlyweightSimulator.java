package com.ajdev.designpatterns.structural.flyweight;

import java.util.Random;

public class FlyweightSimulator {
	private Random random;
	private String[] colors = { "RED", "GREEN", "BLUE" };
	ShapeFactory factory;

	public FlyweightSimulator() {
		random = new Random();
		factory = new ShapeFactory();
	}
	
	public void run() {
		for(int i=0;i<20;i++) {
			Rectangle rect =  (Rectangle)factory.getShape(generateRamdomColor());
			rect.setX(generateRamdomCoordinate());
			rect.setY(generateRamdomCoordinate());
			rect.draw();
		}
	}

	private String generateRamdomColor() {
		return colors[random.nextInt(colors.length)];
	}
	
	private int generateRamdomCoordinate() {
		return random.nextInt(5);
	}

}
