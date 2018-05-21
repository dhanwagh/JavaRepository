package com.tiger.java8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamCount {
	public static void main(String args[]) {
		Predicate<Integer> predicate1= num -> num %2 == 0; 
		List<Integer> listOfNums = Arrays.asList(3,4,6,8);
		System.out.println("Total number of even number " + listOfNums.stream().filter(predicate1).count());
		
		
	}
	
}
