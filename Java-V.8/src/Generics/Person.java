package Generics;

import java.util.*;

public class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Person: " + name;
	}
	// Bounded Wildcards (<? extends Type>)
	public static void printPersons(List<? extends Person> persons) {
		for (Person person : persons) {
			System.out.println(person);
		}
	}
}
