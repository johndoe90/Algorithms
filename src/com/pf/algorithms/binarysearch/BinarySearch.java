package com.pf.algorithms.binarysearch;

public class BinarySearch {

	
	public static void main(String[] args) {
		SortedArray arr = new SortedArray(10);
		arr.display();
		
		arr.insert(4);
		arr.insert(3);
		arr.insert(8);
		arr.display();
		arr.delete(8);
		arr.display();
		
		arr.delete(4);
		arr.delete(3);
		arr.display();
		System.out.println(arr.find(4));
	}
}
