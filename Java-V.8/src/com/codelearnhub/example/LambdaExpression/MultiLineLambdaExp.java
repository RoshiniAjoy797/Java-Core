package com.codelearnhub.example.LambdaExpression;

import java.util.function.*;

public class MultiLineLambdaExp {
	public static void main(String[] args) {
		// no parameters and returns nothing
		Runnable runnable = () -> {
			System.out.println("Hello World");
			System.out.println("You learning Java");
		};
		new Thread(runnable).start();

		// no parameters and returns an empty
		Supplier<String> emptyStringFunction = () -> {
			System.out.println("Supplier");
			return "";
		};
		String result = emptyStringFunction.get(); // This will print "Supplier" and return an empty string
		System.out.println("Returned ----" + result + "-- empty String  ");

		// accepts one parameter and returns nothing
		Consumer<String> printString = aString -> {
			aString = aString.toUpperCase();
			System.out.println(aString);
		};
		// Use the Consumer to process and print a string
		printString.accept("This Consumer Func.Inter."); // Output: HELLO WORLD

		/*
		 * At least two parameters lambda expression that returns two concatenated
		 * strings With "Hello" at the end
		 */
		BinaryOperator<String> concat = (s1, s2) -> {
			String s = s1 + s2;
			s = s.concat("Binary");
			return s;
		};
		String res = concat.apply("Operator", "Function");
		System.out.println(res);
		
	}

}
