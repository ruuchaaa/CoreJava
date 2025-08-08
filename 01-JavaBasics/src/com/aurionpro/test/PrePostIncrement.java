package com.aurionpro.test;

public class PrePostIncrement {
	public static void main(String[] args) {
		int a = 10;
		int b = --a;
		System.out.println(a);
		System.out.println(b);
		//when u want to use updated value immediately u use pre increment; and if u want later on then use post increment
	int x = 11;
	System.out.println(++x + x++);
	System.out.println(x);
	int c = 5;
	System.out.println(c++ + ++c);
	int v= 3;
	System.out.println(v-- - --v);
	
	}
}
