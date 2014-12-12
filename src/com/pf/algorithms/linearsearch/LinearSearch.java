package com.pf.algorithms.linearsearch;

public class LinearSearch {

	public static void main(String[] args) {
		UnsortedArray arr = new UnsortedArray(10);
		arr.insert(0, 4);
		arr.insert(1, 8);
		arr.insert(2, 5);
		arr.insert(3, 3);
		arr.insert(4, 9);
		arr.display();
		
		arr.delete(8);
		arr.display();
		
		System.out.println(arr.find(4));
		System.out.println(arr.find(44));
	}

}
