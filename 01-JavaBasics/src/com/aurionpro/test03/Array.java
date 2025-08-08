package com.aurionpro.test03;

import java.util.Scanner;
//import java.util.Arrays;
public class Array {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter size");
		int size = scanner.nextInt();
		int[] marks = new int[size];
		//System.out.println("Enter your marks");
		for(int i = 0; i<marks.length; i++) {
			System.out.println("Enter marks");
			marks[i] = scanner.nextInt();
		}
		for(int result: marks) {
			System.out.println("The marks are " +result);
		}
		
		
	}

}
