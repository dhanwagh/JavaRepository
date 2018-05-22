package com.tiger.java8.Stream.collectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.tiger.java8.lamdaexpression.Student;

import java.util.function.Function;

public class GroupByCountSort {

	
    public static void main(String[] args) {
    	//3 apples, 2 banana, 1 orange,1 papaya, 2 mango
    	List<String> fruits = 
    				Arrays.asList("apple","apple","banana","orange","papaya","banana","apple","mango","mango");
    	
    	Map<String, Long> result = fruits.stream().collect(Collectors.groupingBy(Function.identity() ,Collectors.counting()));
    	result.forEach((k,v) -> System.out.println("Fruit Name : "+ k + " Count : " + v));
    
    	
    	
    	List <Student> listStudents  = new ArrayList();
    	listStudents.add(new Student("Wagh", 20));
    	listStudents.add(new Student("Shinde", 21));
    	listStudents.add(new Student("Shinde", 26));
    	listStudents.add(new Student("Kadam", 20));
    	listStudents.add(new Student("Khan", 20));
    	listStudents.add(new Student("Gupta", 27));
    	listStudents.add(new Student("Khan", 70));
    	listStudents.add(new Student("Khan", 20));
    	listStudents.add(new Student("Malhotra", 22));
    	listStudents.add(new Student("Malhotra", 25));
    	listStudents.add(new Student("Jadhav", 26));
    	Map<String, Long> counting = listStudents.stream().collect(
    			Collectors.groupingBy(
    				Student::getName, Collectors.counting()    					
    				)    				
    			);
    	counting.forEach((k,v) -> System.out.println("Student Name : "+ k + " Count : " + v));	
    	
    }
}
