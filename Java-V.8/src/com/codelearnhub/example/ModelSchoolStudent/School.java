package com.codelearnhub.example.ModelSchoolStudent;

import com.codelearnhub.example.ModelPersonEmployee.Person;

public class School {
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "John";
		p.setAddress("Hi, this is my address");
		System.out.println(p.getAddress());
		p.setId("435");
		System.out.println(p.getId());
		
		Student student = new Student();
        student.name = "John";
	}
}
