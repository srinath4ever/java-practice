package com.dpattern.creational.singleton;

import javax.management.RuntimeErrorException;

/**
 * common solution - private constructor creates singletonCommon object
 */
public class SingletonCommon {
	private static SingletonCommon singletonCommon = null;//static reference

	//private constructor methods will only be called by class loader
	private SingletonCommon(){
		if(singletonCommon != null){
			throw new RuntimeErrorException(null,
					"Can not create a new instance, please call getInstance() method"); // this avoids to create instance thru Reflection
		}
		System.out.println("Creating..");
	}

	//only global point of access
	public static SingletonCommon getInstance(){
		if(singletonCommon == null){
			singletonCommon = new SingletonCommon(); //lazy approach
		}
		return singletonCommon;
	}
}
