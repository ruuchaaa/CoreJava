package com.ap.model15;

import java.util.Comparator;

public class NameSortDes implements Comparator<Student>{

	
	

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s2.name.compareTo(s1.name);
	}

}
