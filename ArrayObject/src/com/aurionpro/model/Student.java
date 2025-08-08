package com.aurionpro.model;

public class Student {
	
	String name;
	int rollnum;
	double marks;
	
	
	public Student(String name, int rollnum, double marks) {
		this.name = name;
		this.rollnum = rollnum;
		this.marks = marks;
	}
	
	public void display() {
		System.out.println("StudentName: "+name+"Roll Number: "+rollnum+"CGPA: "+marks);
		System.out.println("-------------------------------------------------");
	}

}
