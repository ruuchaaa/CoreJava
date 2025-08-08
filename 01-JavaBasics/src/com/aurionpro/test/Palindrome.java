package com.aurionpro.test;

public class Palindrome {
	public static void main(String[] args) {
	int number = 12121;
	int ans = 0;
	int original = number;
	while(number>0) 
	{ 
	 int rem = number%10;
	 ans = rem + ans*10;
	 number = number/10;
	}
	if(ans == original) {
		System.out.println("It is a palindrome number");
	}
}
}

