package com.MapInterface.MapImplementations;

import java.util.*;

public class HashMapExample {
	public static void main(String[] args) {
		// Creating HasMap

		Map<String, Integer> numMapping = new HashMap<>();
		// Adding key-value pairs to a HashMap
		numMapping.put("One", 1);
		numMapping.put("Two", 2);
		numMapping.put("Three", 3);
		numMapping.put("Four", null);
		// Add a new key-value pair only if the key does not exist in the HashMap,
		//  or is mapped to `null`
		numMapping.putIfAbsent("Four", 4);
		System.out.println(numMapping);

	}

}
