package com.pf.algorithms.euclid;

/**
 * Find the greates common divisor of two nonnegative integers
 * @author johndoe
 *
 */
public class Euclid {

	public static double modulus(int a, int b) {
		int c = b;
		while ( a - c >= b ) {
			c += b;
		}
		
		return a - c;
	}
	
	public static int gcd(int p, int q) {
		if ( q == 0 ) return p;
		int r = (int) modulus(p, q);//p % q;
		return gcd(q, r);
	}	
	
	public static void main(String[] args) {
		System.out.println(gcd(999, 333));
		//System.out.println(modulus(11, 3));
	}
}
