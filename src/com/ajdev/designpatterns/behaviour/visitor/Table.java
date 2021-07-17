package com.ajdev.designpatterns.behaviour.visitor;

public class Table implements ShoppingItem {

	private double price;
	private String type;

	public Table(String type, double price) {
		this.price = price;
		this.type = type;
	}

	@Override
	public double accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
