package com.ajdev.designpatterns.creation.factory;

public class JSONReader implements Reader {

	@Override
	public String readData() {
		System.out.println("reading data by JSONReader");
		return "data";
	}

}
