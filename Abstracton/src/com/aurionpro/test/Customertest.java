package com.aurionpro.test;

import com.aurionpro.model.CommercialCustomer;
import com.aurionpro.model.Customer;
import com.aurionpro.model.ResidentialCustomer;

public class Customertest {
	
	public static void main(String[] args) {
		
		Customer[] cus = new Customer[2];
		
		cus[0] = new ResidentialCustomer("Rucha",10);
		cus[1] = new CommercialCustomer("Gauri", 12);
		
		for(Customer info: cus) {
			System.out.println("Name is "+info.getName()+" bill is "+info.getunits());
		}
	}

}
