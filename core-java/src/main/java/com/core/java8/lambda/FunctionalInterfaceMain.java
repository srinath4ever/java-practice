package com.core.java8.lambda;

/**
 * passing code implementation as parameter is crux of Functional Interface
 *
 * @author Srinath.Rayabarapu
 *
 */
public class FunctionalInterfaceMain {
	
	public static void main(String[] args) {
		
		//traditional way of working
		carryOutWork(new SimpleFunctionalInterface() {
			@Override
			public void doWork() {
				System.out.println("Works in traditional way too!");
			}
		});
		
		//lambda way of working
		carryOutWork(() -> System.out.println("Works in Lambda!"));

	}
	
	public static void carryOutWork(SimpleFunctionalInterface sfi) {
		sfi.printMe();
		sfi.doWork();
	}
}

/**
 * annotation is to help compiler, without that also can be treated as functional interface.
 */
@FunctionalInterface
interface SimpleFunctionalInterface	{

	default void printMe(){
		System.out.println("Printing from SimpleFunctionalInterface");
	}

	public void doWork();
}