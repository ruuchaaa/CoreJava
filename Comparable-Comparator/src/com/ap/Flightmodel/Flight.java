package com.ap.Flightmodel;

public class Flight {
	
	String airline;
	double fare;
	
	public Flight(String airline, double fare) {
		this.airline = airline;
		this.fare = fare;
	}
	
	public String toString() {
		return "Airline: "+airline+" Fare: "+fare;
	}

}
