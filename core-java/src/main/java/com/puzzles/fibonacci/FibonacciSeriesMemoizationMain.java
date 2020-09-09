package com.puzzles.fibonacci;

import java.time.Clock;
import java.util.HashMap;
import java.util.Map;

/**
 * program to demo memorization(caching of the values) and calculating fibonacci series efficiently.
 * Also compares different approaches
 * 
 * Fibinocci series :0 1 1 2 3 5 8...
 * 
 * f(n) = {	f(n-1) + f(n-2) if n>1
 * 			n 				if n=0,1
 * 
 * @author Srinath.Rayabarapu
 *
 */
public class FibonacciSeriesMemoizationMain {

	public static void main(String[] args) {
		
		int input = 45;
		
		Clock clock = Clock.systemDefaultZone();

		Map<Integer, Integer> cache = new HashMap<>();

		long startingTime = clock.millis();//equivalent to System.currentTimeMillis()
		int calculateCachedFibinocciNumber = findCachedFibinocciNumber(input, cache);
		long endingTime = clock.millis();
		System.out.println("Memorization - Total time in millis : " + (endingTime-startingTime));
		System.out.println(calculateCachedFibinocciNumber);

		startingTime = clock.millis();
		calculateCachedFibinocciNumber = new FibonacciSeriesIterativeMain().findFibinocciNumber(input);
		endingTime = clock.millis();
		System.out.println("Simple Loop - Total time in millis : " + (endingTime-startingTime));
		System.out.println(calculateCachedFibinocciNumber);

		startingTime = clock.millis();
		calculateCachedFibinocciNumber = new FibonacciSeriesRecursionMain().findFibinocciNumber(input);
		endingTime = clock.millis();
		System.out.println("Recursion - Total time in millis : " + (endingTime-startingTime));
		System.out.println(calculateCachedFibinocciNumber);
		
	}

	/**
	 * method demos memorization via a HashMap
	 * 
	 * @param num
	 * @param cache
	 * @return
	 */
	public static int findCachedFibinocciNumber(int num, Map<Integer, Integer> cache) {
		
		if(cache.get(num) != null){
			return cache.get(num);
		}
		
		int result = 0;
		
		if(num == 1 || num == 2){
			result = num-1;
		} else {
			result = findCachedFibinocciNumber(num-1, cache) + findCachedFibinocciNumber(num-2, cache);
		}
		
		cache.put(num, result);
		
		return result;
	}
	
}