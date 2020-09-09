package com.puzzles.fibonacci;

/**
 * Print Fibinocci series example with simple loop - no recursion!
 * 
 * 0 1 1 2 3 5 8 13 21 34 55 
 * 
 * @author Srinath.Rayabarapu
 */
public class FibonacciSeriesIterativeMain {
	
	public static void main(String[] args) {
		for(int i=1; i<=15; i++){
			System.out.print(findFibinocciNumber(i)+" ");
		}
	}

	public static int findFibinocciNumber(int num) {

		if(num == 1 || num == 2){
			return num-1;
		}

		int temp1=0, temp2=1, fibinocci=0;
		for(int i=3; i<=num; i++){
			fibinocci = temp1+temp2;
			temp1 = temp2;
			temp2 = fibinocci;
		}
		return fibinocci;
	}
	
}