package com.tiger.java8.functional;

import java.util.ArrayList;
import java.util.List;

public class MyNumberInAction3 {
	
	
	public static void main(String args[]) {
		List<MyNumber> listOfMyNumber = new ArrayList<>();
		listOfMyNumber.add(new MyNumber(100, 20));
		listOfMyNumber.add(new MyNumber(300, 13));
		listOfMyNumber.add(new MyNumber(200, 18));
		listOfMyNumber.add(new MyNumber(400, 20));
		listOfMyNumber.add(new MyNumber(50, 20));
		listOfMyNumber.add(new MyNumber(78, 20));
		/*
		 * Now instantiate functional interface using static method of Utility class as following.
		 */
		Calculator calc = Utility::add;
		System.out.println(calc.calculate(30, 50)); 
		
		/*
		 * Passing Functional Interface as Method Argument using Method Reference:
		 */
		calc = Utility::multiply;
		for(MyNumber myNumber: listOfMyNumber) {			  
			   System.out.println(myNumber.process(calc));
			} 
	}

}
