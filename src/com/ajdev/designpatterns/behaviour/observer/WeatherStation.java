package com.ajdev.designpatterns.behaviour.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

	private int temperature;
	private int pressure;
	private List<Observer> observers;

	public WeatherStation() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void addObserver(Observer o) {
		observers.add(o);

	}

	@Override
	public void deleteObserver(Observer o) {
		observers.remove(o);

	}

	@Override
	public void NotifyAllObservers() {
		for (Observer observer : observers) {
			observer.update(this.temperature, this.pressure);
		}

	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
		NotifyAllObservers();
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
		NotifyAllObservers();
	}

}
