package com.ap.test14;

import java.util.Hashtable;

public class HashTable {
	
	public static void main(String[] args) {
		
		//HashTable table = new HashTable();
		Hashtable<Integer, String> table = new Hashtable<>();
		
		Hashtable<Integer, String> table1 = new Hashtable<>();
		table.put(1, "Rucha");
		table.put(2, "Gauri");
		table.put(3, "Aruna");
		table.put(4, "Rashi");
		//table1.put(1, "Rucha");
		table1.put(2, "Gauri");
		table1.put(3, "Aruna");
		table1.put(4, "Rashi");
		System.out.println(table);
		System.out.println(table.get(1));
		System.out.println(table.remove(1));
		System.out.println(table.remove(1, "Rucha"));
		System.out.println(table.containsKey(2));
		System.out.println(table.containsKey(3));
		System.out.println(table.clone());
		System.out.println(table.contains("Gauri"));
		System.out.println(table.size());
		System.out.println(table.isEmpty());
		System.out.println(table.keySet());
		System.out.println(table.hashCode());
		System.out.println(table.values());
		System.out.println(table.equals(table1));
		System.out.println(table.entrySet());
		
	}

}
