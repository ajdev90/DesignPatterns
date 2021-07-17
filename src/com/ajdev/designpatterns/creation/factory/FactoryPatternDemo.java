package com.ajdev.designpatterns.creation.factory;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		Reader readerObj = ReaderFactory.getReader(ReaderType.DATABASE);
		System.out.println(readerObj.readData());
	}

}
