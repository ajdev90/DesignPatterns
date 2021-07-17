package com.ajdev.designpatterns.creation.prototype;

public abstract class Shape {

	int height;
	int width;

	public Shape(int height, int width) {
		this.height = height;
		this.width = width;
	}

	abstract Shape cloneObject();

	abstract void draw();
}
