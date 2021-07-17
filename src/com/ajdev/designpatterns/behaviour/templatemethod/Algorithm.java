package com.ajdev.designpatterns.behaviour.templatemethod;

public abstract class Algorithm {
	private int nums[];

	public Algorithm(int nums[]) {
		this.nums = nums;
	}

	abstract void initialize();

	abstract void sort();

	abstract void showData();

	public final void Sort() {
		initialize();
		sort();
		showData();
	}

}
