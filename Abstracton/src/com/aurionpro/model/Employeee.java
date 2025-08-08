/*Create an abstract class Employee with fields name, id, and an abstract method
calculateSalary().
Subclasses:
 Developer: Salary = baseSalary + bonus
 Intern: Salary = stipend
In the main() method:
 Create an array of 2 Developer and 2 Intern objects.
 Loop through the array and print names with their salaries
*/
package com.aurionpro.model;

public abstract class Employeee {
	String name;
	int id;
	
	public Employeee(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	public abstract int calculateSalary();
	public String getName() {
		return name;
	}

}
