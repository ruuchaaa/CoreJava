package com.aurionpro.model;

public class Book {
	
	int bookId ;
	String title;
	public Book(int bookId, String title) {
		this.bookId = bookId;
		this.title = title;
	}
	
	public void details() {
		//System.out.println("Book title is: "+bookId);
		System.out.println(title);
		System.out.println("-------------------------------");
	}
	
	public void ids() {
		//System.out.println("BookId is: "+bookId);
		System.out.println(bookId);
		System.out.println("-------------------------------");
	}

}
