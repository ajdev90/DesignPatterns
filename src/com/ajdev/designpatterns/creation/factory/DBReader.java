package com.ajdev.designpatterns.creation.factory;

public class DBReader implements Reader {

	@Override
	public String readData() {
		System.out.println("reading data by DBReader");
		return "data";
	}

}
