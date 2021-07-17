package com.ajdev.designpatterns.behaviour.visitor1;

public class Circle implements Shape {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitCircle(this);

	}

}
