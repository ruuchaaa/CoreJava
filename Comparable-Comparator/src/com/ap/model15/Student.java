package com.ap.model15;

public class Student{// implements Comparable<Student>{
	int id;
	String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

//	@Override
//	public int compareTo(Student student) {
//		return this.id - student.id;
//		//return this.name.compareTo(student.name);
//	}
//	
	
	public String toString() {
		return "ID: "+id+ " Name "+name;
	}
	
	

}
