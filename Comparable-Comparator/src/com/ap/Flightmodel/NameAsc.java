package com.ap.Flightmodel;

import java.util.Comparator;

public class NameAsc implements Comparator<Flight> {

	@Override
	public int compare(Flight f1, Flight f2) {
		// TODO Auto-generated method stub
		return f1.airline.compareTo(f2.airline);
	}
	
	

}
