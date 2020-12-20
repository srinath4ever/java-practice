package com.dsalgo.arrays;

/**
 * program to left rotate an array on given number of times.
 * 
 * @author Srinath.Rayabarapu
 */
public class ArrayRotationsMain {

	public static void main(String[] args) {
		
		int[] temp = {1, 2, 3, 4, 5};
		
		rotate(temp , 3);
		
		print(temp);
		
	}

	private static void print(int[] temp) {
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
	}

	private static void rotate(int[] temp, int i) {
		while(i-- > 0) {
			int tp = temp[0];
			for (int j = 0; j < temp.length-1; j++) {
				temp[j] = temp[j+1];
			}
			temp[temp.length-1] = tp;
		}
	}
	
}