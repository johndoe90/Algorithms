package com.pf.algorithms.simplesorting;

public class InsertionSort {
	public static void display(int[] arr) {
		for ( int i = 0; i < arr.length; i++ ) {
			System.out.println(arr[i]);
		}
		
		System.out.println("------------------------------");
	}
	
	public static void sort(int[] arr) {
		/*int i, j, marked, temp;
		
		for ( i = 1; i < arr.length; i++ ) {
			marked = arr[i];
			
			j = i;
			while ( j > 0 && arr[j-1] >= marked ) {
				arr[j] = arr[j-1];
				j--;
			}
			
			arr[j] = marked;
		}*/
		
		
		int temp, j;
		for ( int i = 1; i < arr.length; i++ ) {
			j = i;
			temp = arr[i];
			while ( j > 0 && temp < arr[j-1] ) {
				arr[j] = arr[j-1];
				j--;
			}
			
			arr[j] = temp;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {4,78,2,4,6,99,74,12,45,1};
		display(arr);
		sort(arr);
		display(arr);
	}
}
