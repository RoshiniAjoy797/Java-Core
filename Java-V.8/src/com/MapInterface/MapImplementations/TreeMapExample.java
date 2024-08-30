package com.MapInterface.MapImplementations;

import java.util.*;

public class TreeMapExample {
	public static void main(String[] args) {
		Map<String, String> fileExtensions = new TreeMap<>();
		fileExtensions.put("Python", ".py");
		fileExtensions.put("C++", ".cpp");
		fileExtensions.put("Kotlin", ".kt");
		fileExtensions.put("Golang", ".go");
		fileExtensions.put("Java", ".java");

		fileExtensions.putIfAbsent("Javascript", ".js");
		System.out.println(fileExtensions);
	}

}
