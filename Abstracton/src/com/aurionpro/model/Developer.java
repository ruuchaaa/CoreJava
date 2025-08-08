package com.aurionpro.model;

public  class Developer extends Employeee {
	
	int base;
	int bonus;
	
	public Developer(String name, int id,int base, int bonus) {
		super(name, id);
		this.base = base;
		this.bonus = bonus;
		// TODO Auto-generated constructor stub
	}
	
	 public int calculateSalary() {
		int sal = base + bonus;
		return sal;
		
	}

}
