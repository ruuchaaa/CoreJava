package com.ap.Flightmodel;

import java.util.Comparator;

public class FareSortdesc implements Comparator<Flight> {

	@Override
	public int compare(Flight f1, Flight f2) {
		return (int) (f2.fare - f1.fare);
	}
	
	
}
