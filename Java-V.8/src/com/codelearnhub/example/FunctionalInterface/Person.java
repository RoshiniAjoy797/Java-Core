package com.codelearnhub.example.FunctionalInterface;

public class Person {
	private String name;
	private String surname;
	private int age;

	public Person(String name, String surname, Integer age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getAge() {
		return age;
	}

}
