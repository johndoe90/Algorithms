package com.pf.algorithms.simplesorting;

public class BucketSort {

	public static void sort(int[] arr, int max) {
		int[] buckets = new int[max+1];
		
		for ( int i = 0; i < arr.length; i++ ) 
			buckets[arr[i]]++;
		
		int index = 0;
		for ( int i = 0; i < buckets.length; i++ ) {
			for ( int j = 0; j < buckets[i]; j++ ) {
				arr[index++] = i;
 			}
		}
	}
	
	public static void main(String[] args) {
		int max = 10;
		int[] arr = new int[] {4,1,2,5,6,4,2,0,7,8};
		sort(arr, max);
		
		
		for ( int i = 0; i < arr.length; i++ ) {
			System.out.println(arr[i]);
		}
	}
}
