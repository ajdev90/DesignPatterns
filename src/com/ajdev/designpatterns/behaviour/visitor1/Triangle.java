package com.ajdev.designpatterns.behaviour.visitor1;

public class Triangle implements Shape {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitTriangle(this);

	}

}
