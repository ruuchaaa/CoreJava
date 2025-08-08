package com.aurionpro.test05;

import java.util.Scanner;

public class CumulativeAddition {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] names = new String[3];
		System.out.println("enter names");
		for(int i = 0; i< 3; i++) {
			names[i] = scanner.nextLine();
		}
		int sum = 0;
		for(int i = 0; i<3; i++) {
			sum = sum + names[i].length();
		}
		
		System.out.println(sum);
		
		
	}

}
