package com.ajdev.designpatterns.behaviour.strategy;

public class MultiplicationStrategy implements Strategy {

	@Override
	public int execute(int x, int y) {
		return x * y;
	}

}
