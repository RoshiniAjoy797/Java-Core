package com.Collection.SetImplementations;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetExample {
	/*
	 * Real-World Example: Java EnumSet in Pizza Ordering System
	 */
	enum Topping {
		CHEESE, TOMATO, PEPPERONI, MUSHROOM, OLIVE, BELL_PEPPER;
	}

	public static void main(String[] args) {
		Set<Topping> pizzaOrder1 = EnumSet.of(Topping.CHEESE, Topping.TOMATO);
		System.out.println("1. Pizza order with toppings :" + pizzaOrder1);

		Set<Topping> pizzaOrder2 = EnumSet.of(Topping.BELL_PEPPER, Topping.OLIVE, Topping.MUSHROOM);
		System.out.println("2. Vegetarian pizza with toppings: " + pizzaOrder2);
	}
}
