package com.ajdev.designpatterns.structural.flyweight;

public class Rectangle implements Shape {

	private int x;

	private int y;
	private String color;

	public Rectangle(String color) {
		this.color = color;
		System.out.println("Created a new rectangle:" + this.color);
	}

	@Override
	public void draw() {
		System.out.println("Drawing rectanle color:" + this.color + " x=" + this.x + " ,y=" + this.y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
