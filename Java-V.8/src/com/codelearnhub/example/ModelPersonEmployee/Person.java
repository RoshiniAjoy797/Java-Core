package com.codelearnhub.example.ModelPersonEmployee;

public class Person {
	public String name;
	protected String surname;
	String address; // package-privates
	private String Id;

	public String getId() {
		return Id;
	}

	public void setId(String Id) {
		this.Id = Id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "Roshini";
		p.surname = "Ajoy";
		p.address = "18A/3W, Theni";
		p.Id = "HJ567900";
		
		 System.out.print(p.name+" ");
	     System.out.println(p.surname);
	     System.out.println(p.address);
	     System.out.println(p.Id);
	}
	
}
