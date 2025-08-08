package com.aurionpro.test;


public class PrimeNumber {
	public static void main(String[] args) {
		
		int number = 3;
		boolean isPrime = true;
		if(number<=1) {
			isPrime = false;
		}
		else {
			for(int i = 2; i<=Math.sqrt(number); i++) {
				if(number%i ==0) 
				{
					isPrime = false;
					break;
				}
			}
		}
		if(isPrime) {
			System.out.println("its a prime number");
		}
		else {
			System.out.println("its not a prime number");
		}
	}
}
