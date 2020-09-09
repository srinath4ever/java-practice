package com.core.java8.lambda;

import com.core.java8.streams.to.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Predicate is functional interface. It mean we can pass lambda expressions wherever predicate is expected
 * 
 * @author srayabar
 *
 */
public class PredicatesDemo {
	
	public static void main(String[] args) {
		
		//it's a boolean valued predicate
		Predicate<Person> personAgePred = p -> p.getAge() > 21 && p.getFirstName().equalsIgnoreCase("rayabarapu");
		
		List<Person> personsList = Arrays.asList(
				new Person("rayabarapu", "srinath", 32),
				new Person("rayaba", "srinath", 32), 
				new Person("rrapu", "srinath", 32),
				new Person("rayabarapu", "srinath", 32), 
				new Person("abarapu", "srinath", 32),
				new Person("rayabarapu", "srinath", 32), 
				new Person("rayabarapu", "srinath", 32),
				new Person("sdsd", "srinath", 32)
				);
				
		List<Person> filteredPersons = personsList.stream().filter(personAgePred).collect(Collectors.toList());
		
		filteredPersons.stream().forEach(p -> System.out.println(p.getFirstName()));
	}

}