
package com.ap.Flighttest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.ap.Flightmodel.FareSortdesc;
import com.ap.Flightmodel.Faresort;
import com.ap.Flightmodel.Flight;
import com.ap.Flightmodel.NameAsc;
import com.ap.Flightmodel.NameDesc;

public class Flights {
	
	public static void main(String[] args) {
		ArrayList<Flight> list = new ArrayList<Flight>();
		list.add(new Flight("IndiGo", 1234));
		list.add(new Flight("AirAsia", 3234));
		list.add(new Flight("Houstonflies", 3411));
		list.add(new Flight("TurkishAirlines", 9802));
		list.add(new Flight("AirJet", 6743));
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter ehow u want to sort flight via airline name or fare");
		String sort = scanner.nextLine();
		if(sort.equals("fare")) {
			System.out.println("Enter ascending fare or descending");
			String order = scanner.nextLine();
			
			if(order.equalsIgnoreCase("Ascending")) {
				Collections.sort(list, new Faresort());
			}
			else {
				Collections.sort(list, new FareSortdesc() );
			}
		}
		
		else {
			System.out.println("Enter ascending airline or descending");
			String order = scanner.nextLine();
			if(order.equalsIgnoreCase("Ascending")) {
				Collections.sort(list, new NameAsc() );
			}
			else {
				Collections.sort(list, new NameDesc() );
			}
			
		}
		
		System.out.println(list);
		
	}

}
