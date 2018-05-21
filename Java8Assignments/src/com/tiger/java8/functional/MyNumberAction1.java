package com.tiger.java8.functional;

import java.util.ArrayList;
import java.util.List;
import com.tiger.java8.functional.MyNumber;

public class MyNumberAction1 {
	/*
	 * Here we are directly passing lambda expression as an argument for multiplication.
	 */
	public static void main(String args[]) {
	List<MyNumber> listOfMyNumber = new ArrayList<>();
	
	listOfMyNumber.add(new MyNumber(100, 20));
	listOfMyNumber.add(new MyNumber(300, 13));
	listOfMyNumber.add(new MyNumber(200, 18));
	listOfMyNumber.add(new MyNumber(400, 20));
	listOfMyNumber.add(new MyNumber(50, 20));
	listOfMyNumber.add(new MyNumber(78, 20));
	
	for(MyNumber myNumber: listOfMyNumber) {
		System.out.println("Proccesing the number"+ myNumber.process((n1,n2)->n1*n2));
	}
	
	}
	
	
}
