package com.aurionpro.test;

import com.aurionpro.model.Developer;
import com.aurionpro.model.Employeee;
import com.aurionpro.model.Intern;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		Employeee[] emp = new Employeee[4];
		
		
		emp[0] = new Developer("Rucha", 1, 70000, 30000);
		emp[1] = new Intern("Gauri", 2, 100000);
		emp[2] = new Developer("Ruchaa", 91, 170000, 3000);
		emp[3] = new Intern("Gauriii", 22, 1000);
		
		
		for(Employeee info:emp ) {
			System.out.println("Name is: "+info.getName()+" salary is: "+info.calculateSalary());
		}
		
	}
	
	
	
}
