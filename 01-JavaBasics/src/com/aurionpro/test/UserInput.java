package com.aurionpro.test;
import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter age:");
		int age = scanner.nextInt();
		
		scanner.nextLine();
		System.out.println("enter name:");
		String username = scanner.nextLine();
		System.out.println("My name is "+username+" and my age is"+age+" years old");
		
	}
	
	//next reads just first word and forbids to read after space
	//nextLine reads whole thing with spaces as well
	//if u r writing integer input before string input make sure to write scanner.nextLine
	//for character u can take charAt(0)
}
