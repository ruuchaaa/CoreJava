package com.aurionpro.test;

public class PerfectNumber {
	public static void main(String[] args) {
		int number = 6;
		int sum = 0;
		for(int i = 1;i<=number/2;i++) {
			if(number%i == 0) {
				sum += i;
			}
		}
		if(sum == number){
			System.out.println("Its a perfect number");
		}
		else {
			System.out.println("Not a perfect number");
		}
	}

}
