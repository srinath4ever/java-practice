package com.core.comparator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * Comparator interface will not alter the class behavior. It will act like a utility method to sort items. 
 * Can create as many as comparators on a class to sort.
 *
 * java.util.Comparator is used to sort collection of different types(classes) like List<Object>.
 * It means Comparator is like "I can compare myself with other object of same/different type"
 * 
 * @author Srinath.Rayabarapu
 *
 */
public class ComparatorMain {
	
	private static final Logger LOG = LoggerFactory.getLogger(ComparatorMain.class);

    private static Comparator<Student> studentComparator = (stu1, stu2) -> {
        if (stu1.getStudentId() > stu2.getStudentId()) {
            return 1;
        } else if (stu1.getStudentId() < stu2.getStudentId()) {
            return -1;
        }
        return 0;
    };

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "abc", "6"));
        students.add(new Student(4, "abc", "1"));
        students.add(new Student(2, "bca", "2"));

        // creating a comparator from interface itself
        students.sort(studentComparator);

        Comparator<Student> byName =
                (Student o1, Student o2)->o1.getStudentName().compareTo(o2.getStudentName());

        Collections.sort(students, byName);

        for(Student student : students){
            LOG.info("Student ID : {}", student.getStudentId());
        }
        LOG.info("");

        students = new ArrayList<>();
        students.add(new Student(1, "abc", "6"));
        students.add(new Student(4, "abc", "1"));
        students.add(new Student(2, "bca", "2"));

        // creating a comparator out of a class
        students.sort(new StudentClassComparator());
        for(Student student : students){
            LOG.info("{}", student.getStudentId());
        }
        LOG.info("");

        // we can define comparator to a tree set to sort its elements
        Set<Student> treeSet = new TreeSet<>(new StudentClassComparator());
        treeSet.add(new Student(1, "abc", "6"));
        treeSet.add(new Student(2, "bca", "2"));
        treeSet.add(new Student(4, "abc", "1"));

        for(Student student : treeSet){
            LOG.info("{}", student.getStudentId());
        }
        LOG.info("");

    }

}

class StudentClassComparator implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		
		if(o1.getStudentId() < o2.getStudentId()){
			return 1;
		} else if(o1.getStudentId() > o2.getStudentId()){
			return -1;
		}
		return 0;
	}
}