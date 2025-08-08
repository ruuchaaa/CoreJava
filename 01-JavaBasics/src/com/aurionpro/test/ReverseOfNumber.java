package com.aurionpro.test;

public class ReverseOfNumber {
	public static void main(String[] args) {
		int number = 1234;
		int answer = 0;
		while(number>0) {
			
			int remainder = number%10;
			answer = remainder + answer*10;
			number = number/10;
		}
		System.out.println(answer);
	}

}
