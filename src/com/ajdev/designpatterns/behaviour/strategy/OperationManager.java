package com.ajdev.designpatterns.behaviour.strategy;

public class OperationManager {
	Strategy strategy;

	public OperationManager(Strategy strategy) {
		this.strategy = strategy;
	}

	public int execute(int a, int b) {
		return this.strategy.execute(a, b);
	}

}
