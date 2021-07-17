package com.ajdev.designpatterns.behaviour.observer;

public class ObserverDemo {

	public static void main(String[] args) {
         WeatherStation station = new WeatherStation();
         WeatherObserver obs = new WeatherObserver(station);
         
         station.setPressure(12);
         station.setTemperature(98);
         
	}

}
