package com.ajdev.designpatterns.creation.factory;

public class XMLReader implements Reader {

	@Override
	public String readData() {
		System.out.println("reading data by XMLReader");
		return "data";
	}

}
