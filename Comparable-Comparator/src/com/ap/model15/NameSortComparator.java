package com.ap.model15;

import java.util.Comparator;

public class NameSortComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		return s1.name.compareTo(s2.name);
	}

}
