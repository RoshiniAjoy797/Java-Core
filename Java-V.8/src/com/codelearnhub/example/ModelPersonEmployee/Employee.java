package com.codelearnhub.example.ModelPersonEmployee;

public class Employee extends Person {
	public static void main(String[] args) {
		Person p = new Person();
		   p.name = "John";
	       p.surname = "Smith";
	       p.address = "Thiseos 100, Kallithea";
	       p.setId("HJ567900");

	       // Then print it
	       System.out.println(p.name);
	       System.out.println(p.surname);
	       System.out.println(p.address);

	       //We can print it only through getter method
	       System.out.println(p.getId());
	}
}
