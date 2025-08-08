package com.aurionpro.test03;

public class CallStack {
	public static void main(String[] args) {
		System.out.println("Method  starts");
		method1();
		System.out.println("Method ends");
	}
	public static void method1() {
		System.out.println("Method 1 starts");
		method2();
		System.out.println("Method 1 ends");
	}
	public static void method2() {
		System.out.println("Method 2 starts");
		method3();
		System.out.println("Method 2 ends");
		
	}
	public static void method3() {
		System.out.println("Method 3 starts");
		System.out.println("Method 3 ends");
		
	}
}
