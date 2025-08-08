package com.ap.test14;

import java.util.TreeMap;

public class Treemapeg {
	
	public static void main(String[] args) {
	
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		TreeMap<Integer, String> map1 = new TreeMap<Integer, String>();
		map.put(1, "Rucha");
		map.put(2, "Gauri");
		map.put(3, "Aruna");
		map.put(4, "Rashi");
		map1.put(1, "Rucha");
		map1.put(2, "Gauri");
		map1.put(3, "Momzzy");
		map1.put(4, "Rashi");
		//System.out.println(map);
		map.putAll(map1);
		System.out.println(map);
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		System.out.println(map.higherKey(4));
		System.out.println(map.lowerKey(2));
		
		
	}

}
