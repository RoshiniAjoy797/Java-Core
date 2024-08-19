package com.codelearnhub.example.FunctionalInterface;

import java.util.function.*;

public interface FunctionExample {
	public static void main(String[] args) {
		/*
		 * Since it is a standard functional interface apply() Method, Interface:
		 * Function<T, R> Purpose: To apply a function to a given argument and return a
		 * result. R apply(T t);-Represents a function that takes an argument of type T
		 * and returns a result of type R.;
		 */

		// Lambda expression for the Function interface

		Function<Integer, Integer> square = x -> x * x;
		// Applying the function to an argument
		System.out.println(square.apply(5));

		/*
		 * accept() Method Interface: Consumer<T> Purpose: To perform an operation on a
		 * given argument and return no result. void accept(T t); - represents an
		 * operation that takes an argument of type T and returns no result. It's often
		 * used for operations that perform side effects, such as printing or modifying
		 * state.
		 */
		// Lambda expression for the Consumer interface
		Consumer<String> printMessage = message -> System.out.println(message);
		// Accepting an argument
		printMessage.accept("Hello, World!"); // Output: Hello, World!
	}

}
