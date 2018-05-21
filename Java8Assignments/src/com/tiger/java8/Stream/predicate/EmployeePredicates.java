package com.tiger.java8.Stream.predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeePredicates {

	public static Predicate<Employee> isAdultMale(){
		return p->p.getAge() > 21 && p.getGender().equalsIgnoreCase("M");		
	}
	
	 public static Predicate<Employee> isAdultFemale() {
	        return p -> p.getAge() > 18 && p.getGender().equalsIgnoreCase("F");
	 }
	 
	 public static Predicate<Employee> isSingh(){
		 return p->p.getLastName().equalsIgnoreCase("Singh");
	 }
	 
	 public static List<Employee> filterEmployees(List<Employee> employees, Predicate <Employee> predicate){
		return employees.stream().filter(predicate).collect(Collectors.toList());		 
		 
	 }
}
