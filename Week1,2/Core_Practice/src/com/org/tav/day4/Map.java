package com.org.tav.day4;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<>();
		   map.put(101, "Red");
		   map.put(103, "Green");
		   map.put(102, "Yellow");
		   map.put(104, "Blue");
		   map.put(106, "Pink");
		   
		   System.out.println("Entries in Map: " +map);  
		   int size = map.size();
		   System.out.println("No. of entries in Map: " +size);

		// Create another map.
		HashMap<Integer,String> map2 = new HashMap<>();
		 map2.put(115, "Brown");
		 map2.put(120, "Purple");
		 map2.put(125, "Green");
		 map.putAll(map2);
		 System.out.println("Entries in updated Map: " +map);
		   
	}

}
