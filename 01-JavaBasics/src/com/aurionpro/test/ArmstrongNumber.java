package com.aurionpro.test;

public class ArmstrongNumber {
  public static void main(String[] args) {
	int number = 1634;
	int digits = 0;
	int temp = number;
	int original = number;
	int answer = 0;
	while(temp!=0) {
		temp = temp/10;
		digits++;
	}
	while(number>0) {
		int remainder = number%10;
		answer += Math.pow(remainder, digits);
		number = number/10;
		
	}
	if(answer == original) {
		System.out.println("Its an Armstrong Number");
	}
	else {
		System.out.println("Not Armstrong");
	}
}

}
