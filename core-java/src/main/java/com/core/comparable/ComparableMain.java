package com.core.comparable;

/**
 * Comparable interface test class on EmployeeEntity class empId field
 *
 * java.lang.Comparable is used to sort collection of same types(classes) like
 * List<Student>, List<EmployeeEntity>, List<Orange>, It means Comparable is like
 * "I can compare myself with another object of same type".
 *
 * @author Srinath.Rayabarapu
 */
public class ComparableMain {

	public static void main(String[] args) {

		Employee employee1 = new Employee(0, null, 0);
		Employee employee2 = new Employee(0, null, 0);

		employee1.setEmpId(1);
		employee1.setEmpName("abc");
		employee1.setDesignation("worker");

		employee2.setEmpId(1);
		employee2.setEmpName("abc");
		employee2.setDesignation("worker");

		int i = employee1.compareTo(employee2);
		System.out.println(i);

		employee1.setEmpId(1);
		employee1.setEmpName("abc");
		employee1.setDesignation("worker");

		employee2.setEmpId(2);
		employee2.setEmpName("abc");
		employee2.setDesignation("worker");

		int i1 = employee1.compareTo(employee2);
		System.out.println(i1);

	}

}