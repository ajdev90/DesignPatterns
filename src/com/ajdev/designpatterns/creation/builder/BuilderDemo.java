package com.ajdev.designpatterns.creation.builder;

import java.util.Locale;

public class BuilderDemo {

	public static void main(String[] args) {
		// Builder pattern examples
		Locale locale = new Locale.Builder().setLanguage("").setRegion("").build();

		User user = new User.UserBuilder("ashish@gmail.com").setMobileNum(123567890).setId(123).build();
		System.out.println(user.toString());

	}

}
