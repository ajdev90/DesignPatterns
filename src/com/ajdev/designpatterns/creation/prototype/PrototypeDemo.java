package com.ajdev.designpatterns.creation.prototype;

public class PrototypeDemo {

	public static void main(String[] args) {
		Shape s = new Rectangle(11, 10);
		s.draw();
		Shape newS =s.cloneObject();
		newS.draw();
	}

}
