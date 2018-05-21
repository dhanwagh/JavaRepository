package com.tiger.java8.Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapStringArray {

	
	public static void main(String args[]) {
        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
        Stream<String> strStream= Arrays.stream(data).flatMap(str->Arrays.stream(str)).filter(str->"a".equals(str.toString()));
        strStream.forEach(str->System.out.println(str));
        
	}
}
