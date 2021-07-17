package com.ajdev.designpatterns.behaviour.observer;

public class WeatherObserver implements Observer {

	private int temperature;
	private int pressure;

	Subject _subject;

	public WeatherObserver(Subject subject) {
		this._subject = subject;
		_subject.addObserver(this);
	}

	@Override
	public void update(int temperature, int pressure) {
		this.pressure = pressure;
		this.temperature = temperature;
		System.out.println("New pressure ="+this.pressure);
		System.out.println("New temperature ="+this.temperature);
	}

}
