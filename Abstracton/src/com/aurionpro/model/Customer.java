/*Create an abstract class Customer with fields name, unitsConsumed, and an abstract method
calculateBill().
Subclasses:
 ResidentialCustomer: ₹5/unit
 CommercialCustomer: ₹8/unit
Use a fixed-size array (e.g., size 3), store objects, and calculate their bills.
*/
package com.aurionpro.model;

public abstract class Customer {
	
	String name;
	int unitsConsumed;
	
	public Customer(String name, int unitsConsumed) {
		this.name = name;
		this.unitsConsumed = unitsConsumed;
	}
	
	abstract double calculateReturn();
	
	public String getName() {
		return name;
	}
	
	public int getunits() {
		return unitsConsumed;
	}
	

}
