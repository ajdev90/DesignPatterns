package com.ajdev.designpatterns.creation.singleton;

import java.io.Serializable;

public class MySingleton implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4693766402193176467L;
	private static MySingleton _instance;

	private MySingleton() {
	}

	public static MySingleton getInstance() {
		if (_instance == null) {
			synchronized (MySingleton.class) {
				if (_instance == null) {
					_instance = new MySingleton();
				}
			}
		}
		return _instance;
	}
	
	protected Object readResolve() {
		System.out.println("read resolve called");
        return _instance;
    }

}
