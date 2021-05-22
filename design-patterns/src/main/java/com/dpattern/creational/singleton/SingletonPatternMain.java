package com.dpattern.creational.singleton;

/**
 * -> one of the Gangs of Four Design patterns
 * -> SingletonCommon pattern restricts the instantiation of a class and ensures that only one instance of the
 * class exists in the java virtual machine. The singleton class must provide a global access point to get 
 * the instance of the class. SingletonCommon pattern is used for logging, drivers objects, caching and thread pool.
 * 
 * Ex: default implementations like java.lang.Runtime, java.awt.Desktop
 *
 * https://www.geeksforgeeks.org/prevent-singleton-pattern-reflection-serialization-cloning/
 * 
 * @author Srinath.Rayabarapu
 *
 */
public class SingletonPatternMain {

	public static void main(String[] args) {
		
		SingletonCommon s1 = SingletonCommon.getInstance();
		SingletonCommon s2 = SingletonCommon.getInstance();
		System.out.println("s1 : " + s1.hashCode());
		System.out.println("s2 : " + s2.hashCode());
		
		EagerStaticBlockSingleton blockSingleton1 = EagerStaticBlockSingleton.getInstance();
		EagerStaticBlockSingleton blockSingleton2 = EagerStaticBlockSingleton.getInstance();
		System.out.println(blockSingleton1.hashCode());
		System.out.println(blockSingleton2.hashCode());
		
		BillPughSinglePattern pattern1 = BillPughSinglePattern.getInstance();
		BillPughSinglePattern pattern2 = BillPughSinglePattern.getInstance();
		System.out.println(pattern1.hashCode());
		System.out.println(pattern2.hashCode());
		
		//classTwoThreads();
		
	}

	/**
	 * 
	 */
	private static void classTwoThreads() {
		Runnable r1 = new Runnable() {			
			@Override
			public void run() {
				while(true) {
					System.out.println(BillPughSinglePattern.getInstance().hashCode());
					try {
						Thread.sleep(100);
					}catch (Exception e) {
						//handle
					}
				}
				
			}
		};
		Runnable r2 = new Runnable() {			
			@Override
			public void run() {
				while(true) {
					System.out.println(BillPughSinglePattern.getInstance().hashCode());
					try {
						Thread.sleep(100);
					}catch (Exception e) {
						//handle
					}
				}
			}
		};
		new Thread(r1).start();
		new Thread(r2).start();
	}
}

