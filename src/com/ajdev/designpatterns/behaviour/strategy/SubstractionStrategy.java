package com.ajdev.designpatterns.behaviour.strategy;

public class SubstractionStrategy implements Strategy {

	@Override
	public int execute(int x, int y) {
		return x - y;
	}

}
