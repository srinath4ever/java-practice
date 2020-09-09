package com.dpattern.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/**
 *class to break eager single pattern implementation with reflection
 */
public class ReflectionSingleMain {

	public static void main(String[] args) {

		EagerStaticBlockSingleton singletonOne = EagerStaticBlockSingleton.getInstance();
		EagerStaticBlockSingleton singletonTwo = null;
		Constructor<?>[] declaredConstructors = EagerStaticBlockSingleton.class.getDeclaredConstructors();
		for(Constructor constructor : declaredConstructors) {
			constructor.setAccessible(true);
			try {
				singletonTwo = (EagerStaticBlockSingleton) constructor.newInstance();
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				e.printStackTrace();
			}
			break;
		}

		System.out.println(singletonOne.hashCode());
		System.out.println((Objects.isNull(singletonTwo)) ? "" : singletonTwo.hashCode());
	}

}
