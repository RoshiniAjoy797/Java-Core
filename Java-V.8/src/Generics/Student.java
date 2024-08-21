package Generics;

import java.util.List;

public class Student extends Teacher {
	private String sname;
	private String grade;

	public Student(Teacher teacher, String sname, String grade) {
		super(teacher.getName(), teacher.getSubject());
		this.sname = sname;
		this.grade = grade;
	}

	public String getGrade() {
		return grade;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Teacher : " + getName() + " , Subject: " + getSubject() + ", Student : " + getSname() + ", Grade: "
				+ grade;
	}

	// Bounded Wildcards (<? extends Type>)
	public static void printStudent(List<? extends Person> persons) {
		for (Person person : persons) {
			System.out.println(person);
		}
	}
}
