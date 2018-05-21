package com.tiger.java8.Stream.map;

public class User {
	private int id;
	private String name;
	public User(int id, String name) {
		this.id = id; 
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {		
		return "Id:- "+this.id+" , " +"Name:- "+this.name;
	}
}
