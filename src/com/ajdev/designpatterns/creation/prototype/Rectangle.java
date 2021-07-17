package com.ajdev.designpatterns.creation.prototype;

public class Rectangle extends Shape {

	public Rectangle(int height, int width) {
		super(height, width);

	}

	public Shape cloneObject() {
		return new Rectangle(this.height, this.width);
	}

	public void draw() {
		System.out.println("drawing shape with height: =" + height + " width=" + width);
	}

}
