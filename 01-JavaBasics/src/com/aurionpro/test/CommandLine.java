package com.aurionpro.test;

public class CommandLine
{
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int sum = a + b;
		System.out.println("addition of a and b is "+sum);
		System.out.println("My name is"+args[2]);
	}

}
