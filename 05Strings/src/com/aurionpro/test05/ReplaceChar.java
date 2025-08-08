package com.aurionpro.test05;

public class ReplaceChar {
	
	public static void main(String[] args) {
		String a = "abcdef";
		String result = " ";
		
		for(int i = 0; i<a.length(); i++) {
			if(a.charAt(i) == 'e') {
				result +='i' ;
			}
			
			
		else {
			result += a.charAt(i);
		}
		
		}
		System.out.println(result);
	}

}
