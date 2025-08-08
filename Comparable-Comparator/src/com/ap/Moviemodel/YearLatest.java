package com.ap.Moviemodel;

import java.util.Comparator;

public class YearLatest implements Comparator<Movie>{

	@Override
	public int compare(Movie m1, Movie m2) {
		if(m1.year == m2.year) {
			return m1.title.compareTo(m2.title);
		}
		else
		return m1.year-m2.year;
		
	}
	
	

}
