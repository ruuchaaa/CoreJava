package com.aurionpro.test05;

public class StringBasics {
	
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		if(str1 == str2) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		String a = "hey";
		String b = new String("hey");
		if(a == b) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		String str = "Hello everyone";
		System.out.println(str.charAt(0));
		System.out.println(str.toCharArray());
		System.out.println(a.compareTo(str));
		System.out.println(str.equals(b));
		
	}

}
