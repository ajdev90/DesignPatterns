package com.ajdev.designpatterns.behaviour.visitor;

public interface ShoppingItem {
	public double accept(ShoppingCartVisitor visitor);

}
