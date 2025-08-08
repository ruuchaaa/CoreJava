package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Book;

public class BookTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of books");
		int number = scanner.nextInt();
		scanner.nextLine();
		Book[] books = new Book[number];
		for(int i = 0; i<number; i++) {
			System.out.println("Enter Book Id");
			int bookId = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter Book title");
			String title = scanner.nextLine();
			books[i] = new Book(bookId, title);
			
		}
		System.out.println("Book titles are:");
		for(Book book: books) {
			book.details();
		}
		
		System.out.println("Book ids are:");
		for(Book book: books) {
			book.ids();
		}
	}

}
