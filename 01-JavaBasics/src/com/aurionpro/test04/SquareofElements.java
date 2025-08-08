package com.aurionpro.test04;

import java.util.Scanner;

public class SquareofElements {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter rows");
		int rows = scanner.nextInt();
		System.out.println("Enter columns");
		int columns = scanner.nextInt();
		int[][] array = new int[rows][columns];
		System.out.println("Enter elements");
		for(int i = 0; i<rows; i++) {
			for(int j = 0; j<rows; j++) {
				array[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Entered elements are");
		for(int i = 0; i<rows; i++) {
			for(int j = 0; j<rows; j++) {

				System.out.print(array[i][j]+ " ");
			}
			System.out.println();
		}
		int sum = 0;
		System.out.println("Sum of elements are");
		for(int i = 0; i<rows; i++) {
			for(int j = 0; j<rows; j++) {
				if(i==j) {
					sum = sum + array[i][j];
				}
					
				//System.out.print(sum+ " ");
			}
			
		}
		System.out.println(sum);
	}

}
