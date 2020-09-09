package com.puzzles.fibonacci;

/**
 * given a number, program prints the fibonacci series of length. Uses recursion!
 * 
 * @author Srinath.Rayabarapu
 *
 */
public class FibonacciSeriesRecursionMain {
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++)
			System.out.println(findFibinocciNumber(i));
	}
	
	public static int findFibinocciNumber(int index) {
		if(index == 0 || index == 1 ){
			return index;
		}
		return (findFibinocciNumber(index-1)+ findFibinocciNumber(index-2));
	}
	
}