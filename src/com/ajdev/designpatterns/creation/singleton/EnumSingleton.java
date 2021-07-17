package com.ajdev.designpatterns.creation.singleton;

public enum EnumSingleton {
	Instance;

	int value;

	public void setValue(int x) {
		this.value = x;
	}

	public int getValue() {
		return this.value;
	}
}
