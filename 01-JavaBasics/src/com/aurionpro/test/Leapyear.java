package com.aurionpro.test;

public class Leapyear {
	public static void main(String[] args) {
		int year= 2056;
		if(year%100 == 0 && year%400 == 0) {
		System.out.println("It is a leap year");
		}
		else if(year%4 == 0) {
			System.out.println("It is a leap year");
			}
		else {
			System.out.println("It is not a leap year");
		}
	}
}
