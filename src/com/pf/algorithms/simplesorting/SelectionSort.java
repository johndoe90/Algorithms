package com.pf.algorithms.simplesorting;

public class SelectionSort {
	public static void display(int[] arr) {
		for ( int i = 0; i < arr.length; i++ ) {
			System.out.println(arr[i]);
		}
		
		System.out.println("------------------------------");
	}
	
	public static void sort(int[] arr) {
		/*int max, temp;
		// start with the largest
		for ( int i = arr.length - 1; i > 0; i-- ) {
			max = i;
			for ( int j = 0; j < i; j++ ) {
				if ( arr[j] > arr[max] ) {
					max = j;
				}
			}
			
			temp = arr[i];
			arr[i] = arr[max];
			arr[max] = temp;
		}*/
		
		int min, temp;
		for ( int i = 0; i < arr.length - 1; i++ ) {
			min = i;
			for ( int j = i + 1; j < arr.length; j++ ) {
				if ( arr[j] < arr[min] ) {
					min = j;
				}
			}
			
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {4,78,2,4,6,99,74,12,45,1};
		display(arr);
		sort(arr);
		display(arr);
	}
}
