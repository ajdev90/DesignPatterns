package com.ajdev.designpatterns.structural.facade;

public class App {

	public static void main(String[] args) {
		SortManager manager = new SortManager();
		manager.DobubbleSort();
		manager.DomergeSort();
		manager.DoquickSort();
	}

}
