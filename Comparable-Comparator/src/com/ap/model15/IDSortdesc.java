package com.ap.model15;

import java.util.Comparator;

public class IDSortdesc implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s2.id - s1.id;
	}
	
	

}
