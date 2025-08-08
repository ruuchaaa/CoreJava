package com.aurionpro.model;

public class  CommercialCustomer extends Customer {
	
	
	int cost;

	public CommercialCustomer(String name, int unitsConsumed) {
		super(name, unitsConsumed);
		//this.cost = cost;	
	}

	@Override
	double calculateReturn() {
		//int price = 0;
		int total = 10*unitsConsumed;
		return 0;
	}

}
