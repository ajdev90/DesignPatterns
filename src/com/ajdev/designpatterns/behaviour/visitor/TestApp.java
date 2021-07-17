package com.ajdev.designpatterns.behaviour.visitor;

import java.util.ArrayList;
import java.util.List;

public class TestApp {

	public static void main(String[] args) {
		List<ShoppingItem> items = new ArrayList<ShoppingItem>();
		items.add(new Table("table1",100));
		items.add(new Table("table2",89));
		items.add(new Table("chair2",100));
		items.add(new Table("chair4",1));
		
		double sum =0;
		
		ShoppingCartVisitor cartVisitor = new ShoppingCart();
		for (ShoppingItem shoppingItem : items) {
			sum+=shoppingItem.accept(cartVisitor);
		}
		
		System.out.println(sum);
	}

}
