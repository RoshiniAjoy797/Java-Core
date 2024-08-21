package Generics;

import java.util.List;

public class Teacher extends Person {

	private String subject;

	public Teacher(String name, String subject) {
		super(name);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	@Override
	public String toString() {
		return "Teacher: " + getName() + ", Subject: " + subject;
	}

	// Bounded Wildcards (<? extends Type>)

	public static void printTeacher(List<? extends Person> persons) {
		for (Person person : persons) {
			System.out.println(person);
		}
	}
}
