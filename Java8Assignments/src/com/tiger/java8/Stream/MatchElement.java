package com.tiger.java8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MatchElement {
public static void main(String args[]) {
	Predicate<Integer> p = num -> num%2 == 0;
	List<Integer> listOfInts = Arrays.asList(3,5,6);
	
	System.out.println("All Match " + listOfInts.stream().allMatch(p));
	System.out.println("All Match " + listOfInts.stream().anyMatch(p));
	System.out.println("All Match " + listOfInts.stream().noneMatch(p));
	
}
	
}
