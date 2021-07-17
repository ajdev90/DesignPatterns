package com.ajdev.designpatterns.structural.adapter;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		var list = new ArrayList<Vehicle>();
		list.add(new Car());
		list.add(new Bus());
		list.add(new BicycleAdapter(new Bicycle()));

		for (Vehicle vehicle : list) {
			vehicle.acclerate();
		}

	}

}
