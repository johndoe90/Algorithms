package com.pf.algorithms.linearsearch;

public class UnsortedArray {
	private int[] numbers;
	private int numElements;
	
	public UnsortedArray(int maxLength) {
		numElements = 0;
		numbers = new int[maxLength];
	}
	
	public void insert(int index, int value) {
		numbers[index] = value;
		numElements++;
	}
	
	public void delete(int value) {
		int index = find(value);
		if ( index != -1 ) {
			for ( int i = index; i < numElements - 1; i++ ) {
				numbers[i] = numbers[i+1];
			}
			
			numElements--;
		}
	}
	
	public int find(int value) {
		for ( int i = 0; i < numElements; i++ ) {
			if ( numbers[i] == value ) {
				return i;
			}
		}
		
		return -1;
	}
	
	public void display() {
		for ( int i = 0; i < numElements; i++ ) {
			System.out.println(numbers[i]);
		}
		
		System.out.println("-----------------------------");
	}
}
