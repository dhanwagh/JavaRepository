package com.tiger.java8.lamdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class ComparatorDemo {
public static void main(String args[]) {
	List <Student> studList = new ArrayList();
	studList.add(new Student("Ram",20));
	studList.add(new Student("Shyam",30));
	studList.add(new Student("Ramesh",10));
	studList.forEach(std -> System.out.println(std.getName()+" "+ std.getAge()));		
	
	Comparator<Student> comp = (Student s1, Student s2) -> s1.getName().compareTo(s2.getName());
	Collections.sort(studList,comp);
	 	
	studList.forEach(std -> System.out.println(std.getName()+" "+ std.getAge()));		

}
}
