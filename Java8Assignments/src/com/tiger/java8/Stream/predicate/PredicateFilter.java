package com.tiger.java8.Stream.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateFilter {

	
	public static void main(String args[]) {
		Predicate<String> predicateOfFilter = str -> str.startsWith("A9");  
		List<String> lst = Arrays.asList("A9Wagh","Gore","Jadhav","Shinde","Kudale","A9Kulkarni");
		System.out.println("List of People in A9 bulding");
		lst.stream().filter(predicateOfFilter).forEach(str -> System.out.println(str) );
		
	}
}
