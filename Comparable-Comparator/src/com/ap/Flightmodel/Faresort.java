package com.ap.Flightmodel;

import java.util.Comparator;

public class Faresort implements Comparator<Flight> {

	@Override
	public int compare(Flight f1, Flight f2) {
		// TODO Auto-generated method stub
		return (int) (f1.fare - f2.fare);
	}
	
	

}
