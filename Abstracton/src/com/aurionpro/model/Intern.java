package com.aurionpro.model;

public  class Intern extends Employeee {
	public Intern(String name, int id, int stipend) {
		super(name, id);
		this.stipend = stipend;
		// TODO Auto-generated constructor stub
	}
	int stipend;
	 public int calculateSalary() {
		int sal = stipend;
		
		return sal;
		
	}
}
