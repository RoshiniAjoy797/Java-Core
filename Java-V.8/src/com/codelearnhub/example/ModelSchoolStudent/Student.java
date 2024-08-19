package com.codelearnhub.example.ModelSchoolStudent;

import com.codelearnhub.example.ModelPersonEmployee.*;

public class Student extends Person {
	public static void main(String[] args) {

		Person person = new Person();
		person.name = "Bill";
		person.setSurname("Gates");
		person.setAddress("U.S.A");
		System.out.println(person.getId());
		
		Student student = new Student();
		student.name="Bill";
		student.surname="Gates";
	}

}
