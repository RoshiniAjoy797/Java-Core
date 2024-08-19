package com.codelearnhub.example.LambdaExpression;

import java.util.function.*;

public class ConstructorReference {
	private String name;
	private int age;

	// Default constructor
	public ConstructorReference() {
		this.name = "Anonymous";
		this.age = 40;
	}

	// Parameterized constructor
	public ConstructorReference(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person{name='" + name + "', age=" + age + "}";
	}

	public static void main(String[] args) {
		/*
		 * You can only use no-parameter constructors with constructor reference,
		 * otherwise, you will have to stick to lambda expressions. You need to use the
		 * Supplier Functional Interface if you do want to use a constructor reference
		 */
		// A_class::new
		Supplier<ConstructorReference> personWithName = ConstructorReference::new;
		ConstructorReference cr = personWithName.get();
		System.out.println(cr);
	}

}
