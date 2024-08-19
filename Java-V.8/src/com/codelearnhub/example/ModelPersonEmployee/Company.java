package com.codelearnhub.example.ModelPersonEmployee;

public class Company {
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "John";
		p.surname = "Smith";
		p.address = "Thiseos 100, Kallithea";
		p.setId("HJ657900");

		System.out.print(p.name + " ");
		System.out.println(p.surname);
		System.out.println(p.address);
		System.out.println(p.getId());
	}

}
