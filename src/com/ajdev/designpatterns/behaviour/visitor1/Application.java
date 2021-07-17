package com.ajdev.designpatterns.behaviour.visitor1;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new Circle());
		shapes.add(new Rectangle());
		shapes.add(new Triangle());
		shapes.add(new Circle());
		shapes.add(new Rectangle());
		shapes.add(new Triangle());
		Visitor v = new SaveFile();
		for (Shape shape : shapes) {
			shape.accept(v);
		}
	}

}
