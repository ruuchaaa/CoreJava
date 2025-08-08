package com.ap.test14;

import java.util.ArrayList;

public class ArrayListex {
	
	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(12);
		marks.add(23);
		marks.add(22);
		marks.add(33);
		//marks.booleanadd()
		System.out.println(marks);
		
		for(Integer mks:marks) {
			System.out.println(mks);
		}
	}

}
