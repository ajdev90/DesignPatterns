package com.ajdev.designpatterns.creation.factory;

public class ReaderFactory {
	public static Reader getReader(ReaderType type) {
		if (type == ReaderType.CSV)
			return new CSVReader();
		else if (type == ReaderType.DATABASE)
			return new DBReader();
		else if (type == ReaderType.TEXTFILE)
			return new TextFileReader();
		else if (type == ReaderType.JSON)
			return new JSONReader();
		else if (type == ReaderType.XML)
			return new XMLReader();
		else
			return null;
	}
}
