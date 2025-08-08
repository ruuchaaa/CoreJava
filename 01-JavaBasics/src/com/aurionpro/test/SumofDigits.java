package com.aurionpro.test;

public class SumofDigits {
	public static void main(String[] args) {
		int number = 123;
		int answer =0;
		while(number>0) {
			int rem = number%10;
			answer = rem + answer;
			number = number/10;
		}
		System.out.println(answer);
	}

}
