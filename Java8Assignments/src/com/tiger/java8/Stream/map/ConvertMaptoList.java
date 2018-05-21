package com.tiger.java8.Stream.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertMaptoList {
	public static void main(String[] args) {
		
		Map<Integer,String> mapNames= new HashMap<>();
		mapNames.put(11, "Jadhav");
		mapNames.put(504, "Wagh");
		mapNames.put(502,"Singh");
		
		List<User> userList= mapNames.entrySet().stream().map(entry -> new User(entry.getKey(),entry.getValue())).collect(Collectors.toList());
		userList.forEach(userEntry -> System.out.println(userEntry.toString()));
	}
}
