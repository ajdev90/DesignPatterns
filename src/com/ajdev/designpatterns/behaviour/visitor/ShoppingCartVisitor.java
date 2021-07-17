package com.ajdev.designpatterns.behaviour.visitor;

public interface ShoppingCartVisitor {
	public double visit(Table table);

	public double visit(Chair chiar);
}
