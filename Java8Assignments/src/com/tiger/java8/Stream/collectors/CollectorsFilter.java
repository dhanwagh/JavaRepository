package com.tiger.java8.Stream.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsFilter {
    public static void main(String[] args) {
    	List<String> nameList = Arrays.asList("Dhananjay","Wagh","Salman","khan","amir","khan","babu","sheth",
    			"raju","gauri","khan","khan");
    	
    	List<String> fileredList = nameList.stream().filter(line -> ! line.equalsIgnoreCase("khan")).collect(Collectors.toList());
    	System.out.println("...After filtering name Khan ....");
    	fileredList.forEach(lineItem -> System.out.println("Name : " + lineItem));
    	
    }
}
