package com.ap.model15;

import java.util.Comparator;

public class IDsort implements Comparator<Student> {

	

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s1.id - s2.id;
	}
	
	

}
