package com.codelearnhub.example.LambdaExpression;

import java.util.function.*;

public class OneLineLambdaExp {
	public static void main(String[] args) {

		/*
		 * A Lambda that accepts no parameters and returns nothing.
		 */
		Runnable run = () -> System.out.println("Hi, World");
		Thread thread = new Thread(run);
		thread.start();
		/*
		 * A Lambda that accepts no parameters and returns an empty string
		 */
		Supplier<String> emptyStrgFunc = () -> "";
		/*
		 * A Lambda that accepts one parameter and returns nothing
		 */
		Consumer<String> printString = (aString) -> System.out.println(aString);
		printString.accept("Hi, from Consumer Func. Inter.");
		Consumer<String> printStng = aString -> System.out.println(aString);

		/*
		 * At least two parameters lambda that returns nothing, and just prints the 2
		 * strings concatenated
		 */
		String st1 = "Hi"; // parameters of Lambda exp.
		String st2 = "100+";
		BiConsumer<String, String> prntStngConcat = (s1, s2) -> System.out.println(s1 + s2);// outer varibles
		prntStngConcat.accept(st1, st2);

		/*
		 * At least two parameters lambda expression that returns two concatenated
		 * strings
		 */
		BinaryOperator<String> concat = (s1, s2) -> s1 + s2;
		String res = concat.apply("100", "100");
		System.out.println(res);

		/*
		 * A 4-parameters lambda that returns a value could be written as follows:
		 */

		QuadFunction<String, String, String, String, String> concatFunction = (s1, s2, s3, s4) -> s1 + s2.toUpperCase()
				+ s3.toLowerCase() + s4;
		String result = concatFunction.apply("Learn", "Java", "ROCK", "It");
		System.out.println(result);
	}
}