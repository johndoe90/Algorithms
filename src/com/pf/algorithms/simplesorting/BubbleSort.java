package com.pf.algorithms.simplesorting;

public class BubbleSort {
	
	public static void display(int[] arr) {
		for ( int i = 0; i < arr.length; i++ ) {
			System.out.println(arr[i]);
		}
		
		System.out.println("------------------------------");
	}
	
	public static void sort(int[] arr) {
		int temp;
		
		for ( int i = 0; i <  1; i++ ) {
			for ( int j = i + 1; j < arr.length; j++ ) {
				if ( arr[i] > arr[j] ) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		/*for ( int i = arr.length - 1; i > 0; i-- ) {
			for ( int j = 0; j < i; j++ ) {
				if ( arr[j] > arr[j+1] ) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}*/

	}
	
	public static void main(String[] args) {
		int[] arr = {4,78,2,4,6,99,74,12,45,1,3};
		display(arr);
		sort(arr);
		display(arr);
		
		System.out.println();
	}
}
