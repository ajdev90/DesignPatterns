package com.ajdev.designpatterns.behaviour.visitor1;

public class Rectangle implements Shape {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitRectangle(this);

	}

}
