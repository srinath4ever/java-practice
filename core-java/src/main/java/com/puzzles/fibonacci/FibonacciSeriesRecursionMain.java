package com.puzzles.fibonacci;

/**
 * given a number, print fibinocci series till the number index, using recursion.
 *
 * Fibinocci series: 1 1 2 3 5 8 13 21 34 55
 *
 * TC: O(2^n)
 * SC: O(n)
 * https://www.youtube.com/watch?v=oBt53YbR9Kk
 *
 * @author Srinath.Rayabarapu
 */
public class FibonacciSeriesRecursionMain {
	
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++)
			System.out.println(findFibinocciNumber(i));
	}
	
	public static int findFibinocciNumber(int index) {
		if(index <= 2){
			return 1;
		}
		return (findFibinocciNumber(index-1) + findFibinocciNumber(index-2));
	}
	
}