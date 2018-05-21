package com.tiger.java8.lamdaexpression;

public class CalculatorDemo {
    
    public static void main(String[] args) {
    	Calculator calculator = (int a, int b) -> a*b;
    	int result = calculator.add(3, 2);
    	System.out.println(result);
    }
}
