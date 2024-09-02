package com.MapInterface.MapImplementations;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class TreeMapExample {

	/*
	 * is a Red-Black tree-based implementation. which provides a guaranteed log(n)
	 * time complexity for the put, get, and remove operations.t stores its elements
	 * in a tree and they are automatically arranged in a natural ascending order.
	 * 
	 * Unlike HashMap and LinkedHashMap, a TreeMap in Java does not allow null keys
	 * but it can have null values. If you try to insert a null key, it will throw a
	 * NullPointerException.
	 */

	// maintain keys in ascending order.
	private static void treeMapAscendOrder() {
		Map<String, String> treeMap = new TreeMap<>(Comparator.reverseOrder());
		treeMap.put("key1", "value1");
		treeMap.put("key3", "value3");
		treeMap.put("key2", "value2");
		treeMap.put("key0", "value0");

		// loop linkedHahMap using java 8 forEach method
		System.out.println("linkedHahMap sing java 8 forEach method");
		treeMap.forEach((k, v) -> {
			System.out.print(k + ": ");
			System.out.println(v);
		});

		// loop linkedHahMap using before java 8 forEach method
		System.out.println("loop linkedHahMap using before java 8 forEach");
		for (Entry pair : treeMap.entrySet()) {
			System.out.print(pair.getKey());
			System.out.println(pair.getValue());
		}
	}

	private static void treeMapDescendOrder() {
		Map<String, String> descend = new TreeMap<>(Comparator.reverseOrder());
		descend.put("key1", "value1");
		descend.put("key3", "value3");
		descend.put("key2", "value2");
		descend.put("key0", "value0");

		// loop treeMap in descending order using Java 8 forEach method
		System.out.println("TreeMap in descending order using Java 8 forEach method:");
		descend.forEach((k, v) -> {
			System.out.print(k + ": ");
			System.out.println(v);
		});
	}

	public static void main(String[] args) {
		
		 
		Map<String, String> fileExtensions = new TreeMap<>();
		fileExtensions.put("Python", ".py");
		fileExtensions.put("C++", ".cpp");
		fileExtensions.put("Kotlin", ".kt");
		fileExtensions.put("Golang", ".go");
		fileExtensions.put("Java", ".java");

		fileExtensions.putIfAbsent("Javascript", ".js");
		System.out.println(fileExtensions);
		System.out.println(fileExtensions.size());

		String s = "Java";
		if (fileExtensions.containsKey(s)) {
			String name = fileExtensions.get(s);
			System.out.println("User with id " + s + " -> " + name);
		} else {
			System.out.println("User does not exist id :" + s);
		}

		System.out.println("Ascending Order:");
		treeMapAscendOrder();
		System.out.println("Descending Order:");
		treeMapDescendOrder();

		TreeMap<Integer, String> users = new TreeMap<>();

		users.put(1003, "A");
		users.put(1001, "B");
		users.put(1002, "C");
		users.put(1004, "D");
		// Check if a given key exists in a TreeMap
		Integer id = 1004;
		if (users.containsKey(id)) {
			// Get the value associated with a given key in a TreeMap
			String name = users.get(id);
			System.out.println("user with id " + id + " : " + name);
		} else {
			System.out.println("user does not exist with id : " + id);
		}
		System.out.println(users);
		System.out.println("Firsr entry : " + users.firstEntry());
		System.out.println("Last entry : " + users.lastEntry());

		// Find the entry whose key is just less than the given key
		Map.Entry<Integer, String> user = users.lowerEntry(1002);
		users.remove(1004);
		System.out.println(users);
		System.out.println(user);

		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(4, "Four");
		tm.put(3, "Three");
		tm.put(10, "Ten");
		tm.put(27, "Twenty seven");
		tm.put(1, "One");

		boolean hasKey = tm.containsKey(27);
		System.out.println(hasKey);

		boolean hasValue = tm.containsValue("Twenty seven");
		System.out.println(hasValue);

		// Iterate over TreeMap

		System.out.println("---Using the for-each loop and the entrySet method");
		for (Map.Entry<String, String> entry : fileExtensions.entrySet()) {
			System.out.print(entry.getKey() + "->" + entry.getValue());
			System.out.println();
		}

		System.out.println("---Using an Iterator");
		Iterator<Map.Entry<String, String>> iterator = fileExtensions.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = iterator.next();
			System.out.print(entry.getKey() + " - " + entry.getValue());
			System.out.println();
		}

		System.out.println("---Using Java 8's forEach");
		Stream<Map.Entry<String, String>> stream = fileExtensions.entrySet().stream();
		stream.forEach(entry -> System.out.println(entry.getKey() + "=" + entry.getValue()));
		System.out.println();
		
		System.out.println("--- Java 8's Stream API");
		Stream<Map.Entry<Integer, String>> stm = tm.entrySet().stream();
		stm.forEach(entry -> System.out.println(entry.getKey()+"--->"+entry.getValue()));
		
	}
}
