package com.MapInterface.MapImplementations;

import java.util.*;

public class LinkedHashMapeExample {
	public static void main(String[] args) {
		Map<String, Integer> dayNumMapping = new LinkedHashMap<>();
		dayNumMapping.put("Mon", 1);
		dayNumMapping.put("Tus", 2);
		dayNumMapping.put("Wen", 3);
		dayNumMapping.put("Thu", 4);
		dayNumMapping.put("Fri", 5);
		dayNumMapping.put("Sat", 6);
		
		dayNumMapping.putIfAbsent("Sun", 1);
		System.out.println(dayNumMapping);

	}

}
