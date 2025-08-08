package com.ap.test14;

import java.util.HashMap;

public class HahMap {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<>();
		
		map.put(1, "Rucha");
		map.put(2, "Rashi");
		map.put(3, "Ancelia");
		map.put(null, "Gauri");
		map.put(4, null);
		
		System.out.println(map);
		map.putIfAbsent(5, "Aruna");
		System.out.println(map);
		System.out.println(map.get(1));
		System.out.println(map.remove(3));
		System.out.println(map.remove(1, "Rucha"));
		System.out.println(map.containsKey(1));
		System.out.println(map.containsValue("Gauri"));
		System.out.println(map.clone());
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.replace(2, "Rucha"));
		System.out.println(map.replace(4, null, "Rashi"));
		System.out.println(map.replace(null, "Gauri", "Didi"));
		System.out.println(map);
	}

}
