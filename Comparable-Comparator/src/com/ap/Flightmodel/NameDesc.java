package com.ap.Flightmodel;

import java.util.Comparator;

public class NameDesc implements Comparator<Flight> {

	@Override
	public int compare(Flight f1, Flight f2) {
		// TODO Auto-generated method stub
		return f2.airline.compareTo(f1.airline);
	}
	

}
