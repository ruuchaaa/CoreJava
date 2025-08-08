package com.aurionpro.test04;

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter rows:");
        int rows = scanner.nextInt();

        System.out.println("Enter columns:");
        int columns = scanner.nextInt();

        int[][] array = new int[rows][columns];

        System.out.println("Enter elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Entered matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Entered elements are");
		for(int i = 0; i<rows; i++) {
			for(int j = 0; j<rows; j++) {

				System.out.print(array[i][j]+ " ");
			}
			System.out.println();
		}

        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < columns; i++) {  
            for (int j = 0; j < rows; j++) { 
                System.out.print(array[j][i] + " "); 
            }
            System.out.println();
        }

        scanner.close();
    }
}

