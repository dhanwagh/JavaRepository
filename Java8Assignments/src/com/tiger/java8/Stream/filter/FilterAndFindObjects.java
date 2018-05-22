package com.tiger.java8.Stream.filter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ListSelectionModel;

import com.tiger.java8.lamdaexpression.Student;

public class FilterAndFindObjects {
    public static void main(String[] args) {
    	
    	List <Student> listStudents  = new ArrayList();
    	listStudents.add(new Student("Wagh", 20));
    	listStudents.add(new Student("Khan", 21));
    	listStudents.add(new Student("shinde", 26));
    	listStudents.add(new Student("Kadam", 20));
    	listStudents.add(new Student("Kudale", 20));
    	listStudents.add(new Student("Gupta", 27));
    	listStudents.add(new Student("Tayde", 70));
    	listStudents.add(new Student("Jain", 20));
    	listStudents.add(new Student("Malhotra", 22));
    	listStudents.add(new Student("Malhotra", 25));
    	listStudents.add(new Student("Jadhav", 26));
    	
    	Student findStudent = listStudents.stream().filter(
    			student -> student.getName().equalsIgnoreCase("malhotra")
    			).findAny().orElse(null);
    	
    	System.out.println("Student Malhotra found and his age is " + findStudent.getAge());
    	
    	 findStudent = listStudents.stream().filter(
    			student -> student.getName().equalsIgnoreCase("tayde")
    			).findAny().orElse(null);
    	 if(findStudent == null) {
    		 System.out.println("Student Tayde not present in the list");
    	 }else {
    		 System.out.println("Student Tayde found and his age is " + findStudent.getAge());
    	 }
    }
}
