package com.ajdev.designpatterns.creation.singleton;

public class SingletonDemoEnum {

	public static void main(String[] args) {
		EnumSingleton instance1 = EnumSingleton.Instance;
		EnumSingleton instance2 = EnumSingleton.Instance;
		if (instance1 == instance2)
			System.out.println("true");
		else
			System.out.println("false");
	}

}
