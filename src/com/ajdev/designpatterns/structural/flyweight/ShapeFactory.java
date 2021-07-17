package com.ajdev.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
	private Map<String, Shape> shapes;

	public ShapeFactory() {
		shapes = new HashMap<String, Shape>();
	}

	public Shape getShape(String color) {
		if (shapes.containsKey(color))
			return shapes.get(color);
		else {
			Shape newShape = new Rectangle(color);
			shapes.put(color, newShape);
			return newShape;
		}
	}
}
