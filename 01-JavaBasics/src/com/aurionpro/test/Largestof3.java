package com.aurionpro.test;

public class Largestof3 {
	public static void main(String[] args) {
		int number_1 = 19;
		int number_2 = 17;
		int number_3 = 10;
		
		//int largest = number_1;
		if(number_1>number_2 && number_1> number_3) {
			System.out.println(" Number_1 is largest");
		}
		
		else if(number_2> number_3) {
			System.out.println(" Number_2 is largest");
		}
		
		else {
			System.out.println(" Number_3 is largest");
		}
		
		
	}
}
