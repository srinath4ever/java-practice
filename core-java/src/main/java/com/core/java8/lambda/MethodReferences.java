package com.core.java8.lambda;

import com.core.java8.streams.to.Person;

/**
 * 
 * @author srayabar
 *
 */
public class MethodReferences {
	
	public static void main(String[] args) {
		
		Something something = new Something();
		
		FindFirster<String, String> find = something::startsWith;
		
		String convert = find.findFirst("ABC");
		
		System.out.println(convert);
		
		PersonFactory<Person> factory = Person::new;//looks for a constructor which is matching to interface method
		
		Person create = factory.create("Peter", "Pullamma");
		
		FirstName<String> fN = create::getFirstName;
		System.out.println(fN.getName());
		
		//lambda expression is a runnable object/piece of code
		//Thread t1 = new Thread(() -> printMessage());
		
		//can use only in case of pass through
		Thread t1 = new Thread(MethodReferences::printMessage);
		t1.start();
		
	}
	
	public static void printMessage() {
		System.out.println("printing");
	}
	
}

class Something{
	String startsWith(String s){
		return String.valueOf(s.charAt(0));
	}
}

interface PersonFactory<P extends Person>{
	P create(String firstName, String lastName);
}

/**
 * functional interface must have exactly one abstract method
 */
@FunctionalInterface //optional
interface FindFirster<F, T>{
	T findFirst(F from);
}

interface FirstName<S>{
	String getName();
}