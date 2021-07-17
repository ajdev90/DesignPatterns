package com.ajdev.designpatterns.structural.adapter;

public class Bus implements Vehicle {

	@Override
	public void acclerate() {
		System.out.println("Bus is acclerating");
	}

}
