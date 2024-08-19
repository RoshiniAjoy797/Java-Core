package com.codelearnhub.example.FunctionalInterface;

import java.util.function.*;
import java.util.stream.Stream;

public class FunctionalInterfaceExample {
	public static void main(String[] args) {
		predicateExample();
		consumerExample();
		useCustomFunctionalInterface();
	}

	public static void predicateExample() {
		System.out.println("1.Predicate Example..");
		String[] testStrings = {"Hello", "World!", "Code!", "Learn", "Hub"};
		// Define a predicate that checks if a string is equal to "Hello"
		Predicate<String> isHello = Predicate.isEqual("Hello");

		// Define a predicate that checks if a string contains "!"
		Predicate<String> containsExclamation = s -> ((String) s).contains("!");

        // Print the results for isHello predicate
        System.out.println("1.1 Results for isHello predicate:");
        for (String s : testStrings) {
            System.out.println(s + ": " + isHello.test(s));
        }

        // Print the results for containsExclamation predicate
        System.out.println("1.2 Results for containsExclamation predicate:");
        for (String s : testStrings) {
            System.out.println(s + ": " + containsExclamation.test(s));
        }
		
		// Combine predicates: Negate the predicate that checks for "!" and then or it
		// with isHello
		Predicate<String> combinedPredicate = isHello.or(containsExclamation.negate());
		
		// Use the combined predicate in a stream
		Stream.of("Hello", "World!", "Code!", "Learn!", "Hub")
		.filter(combinedPredicate)
		.forEach(System.out::println);
	}

	// Example of using a custom functional interface
	public static void useCustomFunctionalInterface() {
		System.out.println("2. useCustom functional interface");
		TriFunction<String, String, Integer, String> function = (s1, s2, i1) -> s1 + s2 + i1;

	    // Create a stream of Person objects and use the TriFunction
		 Stream.of(
	                new Person("Geo", "Pal", 26),
	                new Person("Dim", "Tas", 35),
	                new Person("Ion", "Mak", 30)
	        )
		 
	        .map(p -> function.apply (p.getName(), p.getSurname(), p.getAge() ))
	        .forEach(System.out::println);
	}


	// Example implementation for the consumerExample() method
	public static void consumerExample() {
		System.out.println("3.consumerExample() method");
		
		Consumer<String> printString = (aString) -> System.out.println(aString);
		
		Stream.of("Hello", "World", "Java", "Streams").forEach(printString);
	}
}