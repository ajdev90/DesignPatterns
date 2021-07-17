package com.ajdev.designpatterns.behaviour.strategy;

public class StrategyDemo {

	public static void main(String[] args) {
		
		//Strategy can be updated at runtime
		OperationManager op = new OperationManager(new MultiplicationStrategy());
		int x = op.execute(10, 20);
		System.out.println("result =" + x);

	}

}
