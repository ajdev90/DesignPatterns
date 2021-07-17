package com.ajdev.designpatterns.behaviour.visitor;

public class ShoppingCart implements ShoppingCartVisitor {

	@Override
	public double visit(Table table) {
		return table.getPrice();
	}

	@Override
	public double visit(Chair chiar) {
		return chiar.getPrice();
	}

}
