package com.dsalgo.arrays;

/**
 * given an array, reverse it in-place.
 *
 * logic: iterate till array median, where swap arr[i] element to arr[arr.length - (i+1)]
 *
 * @author Srinath.Rayabarapu
 */
public class ReverseArrayMain {
	
	public static void main(String[] args) {
		
		int a[] = { 9, 8, 7, 6, 14};

		System.out.println("Printing array:");
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
		
		System.out.println("Printing reverse order");
		for (int i = a.length - 1; i >= 0; i--)
			System.out.println(a[i]);
		
		//reversing array - swapping first and last elements
		for (int i = 0; i < a.length/2; i++) {
			int j = a[i];
			int k = a[a.length-(i+1)];
			a[a.length-(i+1)] = j;
			a[i] = k;
		}

		System.out.println("Array Reversed - Printing :");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}