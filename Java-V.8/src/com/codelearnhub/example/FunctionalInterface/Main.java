package com.codelearnhub.example.FunctionalInterface;

import java.util.function.Function;

public interface Main {
	/*
	 * concise way to implement a functional interface with a single abstract
	 * method...
	 */
	public static void main(String[] args) {

		// One-line lambda expression
		MyFunctionalInterface mfi = s -> System.out.println("Action performed: " + s);
		mfi.performAction("Hello world!");

		/*
		 * Method and constructor references are shorthand notations for calling methods
		 * and constructors using lambda expressions. They are used when the lambda
		 * expression is simply calling an existing method or constructor. :: - method
		 * reference operator
		 */

		// Method Reference Syntax below :
		// 1. Static Method=> ClassName::staticMethodName
		MyFunctionalInterface myfunc = Utility::print;
		System.out.println("Hello, Method ref..");

		// 2. Instance Method=> instance::instanceMethodName

		String str = "Hello, instance reference";
		// Functional interface with a method signature matching toUpperCase
		StringSupplier supplier = str::toUpperCase;
		// Use the method reference
		System.out.println(supplier.get());

		Function<String, String> myFunc = String::toUpperCase;
		System.out.println(myFunc.apply("Learning"));

		// 3. Constructor Reference Syntax:
		// ClassName::new
		StringFactory factory = String::new;
		String s = factory.create("Hello String factory!");
		System.out.println(s);

		// 4. Multiline Lambda
		MultiLineLambda mlb = (a, b) -> {
			int sum = a + b;
			int prod = a * b;
			System.out.println("Sum : " + sum);
			System.out.println("prod : " + prod);
			return prod;
		};
		int result = mlb.performAction(5, 3);
		System.out.println("Result = " + result);
	}

}
