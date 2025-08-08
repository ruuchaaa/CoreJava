package com.ap.Movietest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.ap.Moviemodel.Movie;
import com.ap.Moviemodel.NameAsc;
import com.ap.Moviemodel.YearLatest;

public class Movietest {
	
	public static void main(String[] args) {
		
		ArrayList<Movie> list = new ArrayList<Movie>();
		Scanner scanner = new Scanner(System.in);
		
		list.add(new Movie("The Notebook", 1999));
		list.add(new Movie("WW2: Anne Frank", 1972));
		list.add(new Movie("Me Before You", 1989));
		list.add(new Movie("Virginia Woolf's Untold Stories", 1965));
	
		while(true) {
		
		System.out.println("Enter by what means u wanna sort");
		String choice = scanner.nextLine();
		if(choice.equalsIgnoreCase("Year")) {
			Collections.sort(list, new YearLatest());
		}
		else {
			Collections.sort(list, new NameAsc() );
		}
		System.out.println(list);
		System.out.println("Press 1 to continue and anything else to exit");
		int in = scanner.nextInt();
		scanner.nextLine();
		if(in == 1) {continue;}
		else {break;} 
		
				
	}
	}

}
