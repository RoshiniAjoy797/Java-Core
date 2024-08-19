package com.codelearnhub.example.Interface;

public interface IDrivable {
	default void canBeDrivenOn() {
		System.out.println("Default is road");
	}

	public abstract void printNumberOfWheels();

	void printTypeOfFuel();

	void drive();

	static void sayHelloFrom(String type) {
		System.out.println("Hello I.m inside " + type);
	}
}
