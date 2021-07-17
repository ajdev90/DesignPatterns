package com.ajdev.designpatterns.behaviour.strategy;

public class DivisionStrategy implements Strategy {

	@Override
	public int execute(int x, int y) {
		return x / y;
	}

}
