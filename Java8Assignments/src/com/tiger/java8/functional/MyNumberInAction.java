package com.tiger.java8.functional;
import java.util.ArrayList;
import java.util.List;

import com.tiger.java8.functional.MyNumber;

public class MyNumberInAction {

	
	public static void main(String args[]) {
		List<MyNumber> list = new ArrayList<>();
		list.add(new MyNumber(100, 40));
		list.add(new MyNumber(300, 60));
		list.add(new MyNumber(60, 20)); 
		
		Calculator calc = (n1,n2) -> n1-n2;
		
		for(MyNumber myNumber: list) {
			System.out.println("My number process" + myNumber.process(calc));
		}
				
	}
}
