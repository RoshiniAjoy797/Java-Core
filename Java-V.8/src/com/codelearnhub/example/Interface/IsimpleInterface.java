package com.codelearnhub.example.Interface;

public interface IsimpleInterface {
	int NUMBER_OF_TIME = 5;

	void printHelloLanguage(String language);

	default void sayHello() {
		System.out.println("Hello world");
	}

	static void sayBye() {
		System.out.println("Bye world");
	}

	static void sayByeMultipleTimes() {
		for (int i = 0; i < NUMBER_OF_TIME; i++) {
			sayBye();
		}

	}
}
