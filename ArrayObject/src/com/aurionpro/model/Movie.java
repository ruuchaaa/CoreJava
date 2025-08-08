package com.aurionpro.model;

public class Movie {
	
	String title;
	String genre;
	public Movie(String title, String genre) {
		
		this.title = title;
		this.genre = genre;
		
	}
	
	public void details() {
		System.out.println("Movie title is: "+title+" its genre is "+genre);
		System.out.println("-------------------------------");

		
	}
	
	public void genree() {
		if(genre.equalsIgnoreCase("Action"))
		System.out.println(title);
		System.out.println("-------------------------------");
	}
}
