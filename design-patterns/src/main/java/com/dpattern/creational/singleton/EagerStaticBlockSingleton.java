package com.dpattern.creational.singleton;

/**
 * Refined above approach to allow - static block initializing and having a way to handle exceptions
 * Still not lazy loading way
 *
 * Breakable with Reflection
 */
public class EagerStaticBlockSingleton{

	private static EagerStaticBlockSingleton singleton;

	//class loader can only call this - called after static block
	private EagerStaticBlockSingleton() {
		System.out.println("Private constructor called");
	}

	static {//will be called first
		System.out.println("Static block called");
		try {
			if(singleton == null)
				singleton = new EagerStaticBlockSingleton();
		}catch(Exception e) {
			//can handle exceptions
		}
	}

	public static EagerStaticBlockSingleton getInstance(){
		return singleton;
	}
}
