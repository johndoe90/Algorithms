package com.pf.algorithms.binarysearch;

public class SortedArray {
	
	private int[] numbers;
	private int numElements;
	
	public SortedArray(int maxElements) {
		numElements = 0;
		numbers = new int[maxElements];
	}
	
	public void delete(int value) {
		int index = this.find(value);
		if ( index != -1 ) {
			for ( int i = index; i < numElements - 1; i++ ) {
				numbers[i] = numbers[i+1];
			}
			
			numElements--;
		}
	}

	//sorted insert
	public void insert(int value) {
		int i = 0;
		while ( numbers[i] <= value && i < numElements ) {
			i++;
		}
		
		for ( int j = numElements - 1; j >= i; j-- ) {
			numbers[j+1] = numbers[j];
		}
		
		numbers[i] = value;
		numElements++;
	}
	
	//binary search
	public int find(int value) {
		int middle;
		int lowerBound = 0;
		int upperBound = numElements - 1;
		
		while ( lowerBound <= upperBound ) {
			middle = (lowerBound + upperBound) / 2;
			if ( numbers[middle] == value ) {
				return middle;
			} else if ( numbers[middle] < value ){
				lowerBound = middle + 1;
			} else {
				upperBound = middle - 1;
			}
		}
		
		return -1;
	}
	
	public void display() {
		for ( int i = 0; i < numElements; i++ ) {
			System.out.println(numbers[i]);
		}
		
		System.out.println("");
	}
}
