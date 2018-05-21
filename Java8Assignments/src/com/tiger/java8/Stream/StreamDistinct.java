package com.tiger.java8.Stream;

import java.util.Arrays;
import java.util.List;

public class StreamDistinct {

	public static void main (String args[]) {
		List<String> lst1 = Arrays.asList("DH","MM","SX","DD","DH");
		System.out.println("List of distict strings"+ lst1.stream().distinct().count());
	}
}
