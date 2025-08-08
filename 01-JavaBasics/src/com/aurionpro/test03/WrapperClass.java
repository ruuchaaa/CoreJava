package com.aurionpro.test03;

public class WrapperClass {
	public static void main(String[] args) {
		int number1 = 10;
		//boxing
		Integer number2 = new Integer(number1);
		System.out.println(number2);
		//autoboxing
		Integer number3 = number1;
		System.out.println(number3);
		//unboxing
		int number4 = number2.intValue();
		//autounboxing
		int number5 = number2;
		System.out.println(number4);
		System.out.println(number5);

	}
	

}
