package com.aurionpro.model;

public class ResidentialCustomer extends Customer{
	
	 int cost;

	public ResidentialCustomer(String name, int unitsConsumed) {
		super(name, unitsConsumed);
		//this.cost = cost;	
	}

	@Override
	double calculateReturn() {
		//int price = 0;
		int total = 5*unitsConsumed;
		return 0;
	}

}
