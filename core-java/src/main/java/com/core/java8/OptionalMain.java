package com.core.java8;

import java.util.List;
import java.util.Optional;

/**
 * using Optional class
 *
 * @author Srinath.Rayabarapu
 */
public class OptionalMain {
	
	public static void main(String[] args) {
		
		Optional<List<student>> studentsListOptional = fetchStudentsList();
		
		//mandatory check
		if(studentsListOptional.isPresent()){
			List<student> list = studentsListOptional.get();
			System.out.println("students size : " + list.size());
		}
	}

	private static Optional<List<student>> fetchStudentsList() {
		
		//from db
		List<student> studsList = null;//new ArrayList<dto>();
		//studsList.add(null);
		return Optional.ofNullable(studsList);
	}

}

class student{
	
}