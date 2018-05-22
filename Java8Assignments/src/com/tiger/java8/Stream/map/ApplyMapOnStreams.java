package com.tiger.java8.Stream.map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import com.tiger.java8.lamdaexpression.Student;

public class ApplyMapOnStreams {
    public static void main(String[] args) {
    	        List<String> alpha = Arrays.asList("a", "b", "c", "d");
    	        
    	        alpha.forEach(str -> System.out.println("String " + str));   	        
    	        
    	        alpha = alpha.stream().map(str->str.toUpperCase()).collect(Collectors.toList());
    	        
    	        alpha.forEach(str -> System.out.println("String " + str));
    	        
    	        
    	        
    	        List<Student> alpha1 = Arrays.asList(
    	        		new Student("Wagh", 20),
    	        		new Student("Khan", 20),
    	        		new Student("Ghatge", 20),
    	        		new Student("Kulkarni", 21),
    	        		new Student("Gokkhale", 20),
    	        		new Student("Kawale", 20)
    	        		);
    	        
    	        List<Student> result = alpha1.stream().map( 
    	        		 student -> 
    	        			 new Student(student.getName().toUpperCase(),student.getAge())
    	        			  
    	        		 )
    	        		.collect(Collectors.toList());
    	        
    	        result.forEach(str -> System.out.println("Students " + str.getName() + str.getAge()));

    }
}
