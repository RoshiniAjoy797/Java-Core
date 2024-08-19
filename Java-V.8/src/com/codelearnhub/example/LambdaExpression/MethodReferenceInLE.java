package com.codelearnhub.example.LambdaExpression;

import java.util.function.*;

public class MethodReferenceInLE {

	public static void main(String[] args) {

		/*
		 * Method reference allows you to write lambda expressions in a more concise
		 * way, by referencing a method.
		 */

		// using lambda
		Consumer<String> printStringLambd = (aString) -> System.out.println(aString);
		printStringLambd.accept("Using Lambda");

		// using method reference
		Consumer<String> printStrindmethodRef = System.out::println;
		printStrindmethodRef.accept("Using Method ref");

		BiConsumer<String, String> stringConcat = LambdaExpression::printConcatStrings;
		stringConcat.accept("Method", "Reference");

		// Class_or_object::a_method
		BinaryOperator<String> concat = String::concat;
		String result = concat.apply("Binary", "Operator");
		System.out.println(result);
		/*
		 * we can replace our lambda expression with a method reference as long as the
		 * signature of the lambda matches the signature of the method that we will
		 * refer to.
		 */

	}
}