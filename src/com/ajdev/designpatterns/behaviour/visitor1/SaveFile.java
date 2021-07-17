package com.ajdev.designpatterns.behaviour.visitor1;

public class SaveFile implements Visitor {

	@Override
	public void visitCircle(Circle c) {
		System.out.println("Saving the Circle...");

	}

	@Override
	public void visitRectangle(Rectangle r) {
		System.out.println("Saving the Rectangle...");

	}

	@Override
	public void visitTriangle(Triangle t) {
		System.out.println("Saving the Triangle...");

	}

}
