package com.tiger.java8.Stream.sort;

public class Student implements Comparable<Student>{

	private int id;
	private String name;
	private int age;
	
	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Student arg0) {
		if(arg0.getAge()<this.getAge()) {
			return -1;
		}else if(arg0.getAge()>this.getAge()){
			return 1;
		}
		return 0;
	}
	
	@Override
	public String toString() {		
		return "ID:-"+this.id +","+"Name:-"+this.name+","+"Age:-"+this.age;
	}
	
	
	@Override
    public boolean equals(final Object obj) {
      if (obj == null) {
         return false;
      }
      final Student std = (Student) obj;
      if (this == std) {
         return true;
      } else {
         return (this.name.equals(std.name) && (this.age == std.age));
      }
    }
}
