package com.aurionpro.test;

public class BillQuestion {
	public static void main(String[] args) {
		int units_consumed = 340;
		int Meter_Charge = 75;
		int charge;
		if(units_consumed<=100) {
			 charge = units_consumed*5;
		}
		else if(units_consumed<=250) {
				charge = units_consumed*10;
			}
			else {
				charge = units_consumed*20;
			}
			
		
		int total_bill = charge + Meter_Charge;
		System.out.println(total_bill);
	}

}
