package com.tiger.java8.Stream.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {

	public static void main(String[] args) {
		
		List<Student> listOfStudents = new ArrayList<Student>();
		listOfStudents.add(new Student(1, "Mahesh", 12));
		listOfStudents.add(new Student(2, "Suresh", 15));
		listOfStudents.add(new Student(3, "Nilesh", 10));
		listOfStudents.add(new Student(3, "Jignesh", 25));
		
		System.out.println("---Natural Sorting by Age---");
		List<Student> sList = listOfStudents.stream().sorted().collect(Collectors.toList());
		sList.forEach(student->System.out.println(student.toString()));
		System.out.println("---Sorting using Comparator by ID ---");
		List<Student> sList1 = listOfStudents.stream().sorted(Comparator.comparing(Student::getId).reversed()).collect(Collectors.toList());
		sList1.forEach(student -> System.out.println(student.toString()));
			
		
	}
	
	
	
}
