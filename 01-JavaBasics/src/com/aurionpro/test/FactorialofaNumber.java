package com.aurionpro.test;

public class FactorialofaNumber {
	public static void main(String[] args) {
		int number = 10;
		int ans = 1;
		for(int i = 1; i<=number;i++) {
			ans = ans*i;
		}
		System.out.println("Factorial of number is "+ans);
	}

}
