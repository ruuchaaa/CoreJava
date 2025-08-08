package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Movie;

public class MovieTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of movies");
		int number = scanner.nextInt();
		scanner.nextLine();
		Movie[] movies = new Movie[number];
		for(int i = 0; i<number; i++) {
			System.out.println("Enter movie title");
			String title = scanner.nextLine();
			System.out.println("Enter Movie genre");
			String genre = scanner.nextLine();
			movies[i] = new Movie( title, genre);
			
		}
		System.out.println("Movie titles are:");
		for(Movie movie: movies) {
			movie.details();
		}
		
		System.out.println("Movies with action genre are are:");
		for(Movie movie: movies) {
			movie.genree();
		}
	}
}
