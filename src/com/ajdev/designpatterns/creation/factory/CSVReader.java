package com.ajdev.designpatterns.creation.factory;

public class CSVReader implements Reader {

	@Override
	public String readData() {
		System.out.println("reading data by CSVReader");
		return "data";
	}

}
