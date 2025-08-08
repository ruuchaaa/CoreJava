package com.aurionpro.test03;

import java.util.Scanner;

public class Calculator {
	public static double operations(int a, int b) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What operation u want to perform ");
		System.out.println("1 for addition \n 2 for subtraction \n 3 for multiplication \n 4 for division");
		int operation = scanner.nextInt();
		switch(operation){
		case 1:
			return a+b;
			
		case 2:
			return a-b;
			
		case 3:
			return a*b;
			
		case 4:
			if(b == 0) {
				System.out.println("Cant divide");
			}
			else {
				double sol = (double)a/b;
			return sol;
			}
		default:
			System.out.println("Invalid number chosen");
		}
		return 0;
	
	}
	public static void main(String[] args) {
		double ans = operations(21,7);
		System.out.println(ans);
	}

}
