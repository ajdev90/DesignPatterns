package com.ajdev.designpatterns.creation.factory;

public class TextFileReader implements Reader {

	@Override
	public String readData() {
		System.out.println("reading data by TextFileReader");
		return "data";
	}

}
