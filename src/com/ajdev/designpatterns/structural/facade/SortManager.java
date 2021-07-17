package com.ajdev.designpatterns.structural.facade;

public class SortManager {
	private SortAlgo bubbleSort;
	private SortAlgo mergeSort;
	private SortAlgo quickSort;

	public SortManager() {
		this.bubbleSort = new BubbleSort();
		this.mergeSort = new MergeSort();
		this.quickSort = new QuickSort();
	}

	public void DobubbleSort() {
		this.bubbleSort.sort();
	}

	public void DomergeSort() {
		this.mergeSort.sort();
	}

	public void DoquickSort() {
		this.quickSort.sort();
	}
}
