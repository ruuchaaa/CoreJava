package com.aurionpro.test05;

public class StringBuilderr {
	
	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder("Hello");
		stringBuilder.append("World");
		StringBuilder stringBuilder1 = new StringBuilder("Hello");
		System.out.println(stringBuilder);
		System.out.println(stringBuilder.reverse());
		System.out.println(stringBuilder.reverse());
		System.out.println(stringBuilder.replace(0, 1, "f"));
		System.out.println(stringBuilder.hashCode());
		System.out.println((stringBuilder == stringBuilder1));
		System.out.println(stringBuilder.equals(stringBuilder1));
//
		System.out.println(stringBuilder.toString().equals(stringBuilder1.toString()));
//		
		
		StringBuilder sb1 = new StringBuilder("Hello");
		StringBuilder sb2 = new StringBuilder("Hello");

		System.out.println(sb1 == sb2);                        // false (different objects)
		System.out.println(sb1.equals(sb2));                   // false (compares reference)
		System.out.println(sb1.toString().equals(sb2.toString())); // true (compares content)

		
	}

}
