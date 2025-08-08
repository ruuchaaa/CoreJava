package com.ap.Moviemodel;

public class Movie {
	
	public String title;
	public int year;

	
	public Movie(String title, int year) {
		this.title = title;
		this.year = year;
	}
	
	public String toString() {
		return "Title:"+title+" Year:"+year;
	}

}
