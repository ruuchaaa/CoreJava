package com.aurionpro.test;

public class Swapping {
	public static void main(String[] args) {
		float number_1= 12;
		float number_2= 3;
		//with third variable
		/*int temp = number_1;
		number_1 = number_2;
		number_2 = temp;
		System.out.println("Number_1 is "+number_1);
		System.out.println("Number_2 is "+number_2);
		*/
		//without third variable
		 number_1 = number_1+number_2;
		number_2 = number_1-number_2;
		 number_1 = number_1-number_2;
		System.out.println("Number_1 is "+number_1);
		System.out.println("Number_2 is "+number_2);
	}


}
