package Generics;

import java.rmi.server.RMIClassLoader;
import java.util.ArrayList;
import java.util.List;

import javax.print.event.PrintJobAttributeListener;

public class Main {

	/*
	 * <>- Type inference
	 */
	public static void main(String[] args) {

		GenericClass<Integer> intObj = new GenericClass<>();
		intObj.setValue(100);
		System.out.println("Integer Value: " + intObj.getValue());

		GenericClass<String> stringObj = new GenericClass<>();
		stringObj.setValue("Java generics");
		System.out.println("String value: " + stringObj.getValue());

		GenericClass<Boolean> booleanObj = new GenericClass<>();
		booleanObj.setValue(true);
		System.out.println("Boolean Value: " + booleanObj.getValue());

		intObj.print("k");
		stringObj.print(true);

		GenericBounded<Integer> bgi = new GenericBounded<>();
		bgi.setValue(100);
		System.out.println("Integer Value: " + bgi.getValue());

		GenericBounded<Double> bgd = new GenericBounded<>();
		bgd.setValue(4.89);
		System.out.println("Double Value: " + bgd.getValue());

		// The following line will cause a compile-time error
		// BoundedGeneric<String> stringObj = new BoundedGeneric<>();

		GenericInterface<String> sImpl = new GenericInterfaceImpl<>();
		sImpl.display("Hello, Generics");

		GenericInterface<Integer> iImpl = new GenericInterfaceImpl<>();
		iImpl.display(1000);

		// Unbounded Wildcards (?)
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(1);
		intList.add(3);
		GenericWildcards.printList(intList);

		List<String> sList = new ArrayList<>();
		sList.add("Hello");
		sList.add("Gene");
		GenericWildcards.printList(sList);

		NonGenericClass ngc = new NonGenericClass();
		ngc.<String, Integer>vmethod("Hello", 123);
		Integer result = ngc.<String, Integer>rmethod("world", 90);
		System.out.println(result);

		// Bounded Wildcards (<? extends Type>)

		List<Person> people = new ArrayList<>();
		people.add(new Person("John"));
		people.add(new Person("Bill"));
		people.add(new Person("Kamala"));
		people.add(new Person("Trump"));
		Person.printPersons(people);

		List<Teacher> teacher = new ArrayList<>();
		teacher.add(new Teacher("Elon Musk", "Physics"));
		teacher.add(new Teacher("Marie Curie", "Chemistry"));
		Teacher.printTeacher(teacher);

		List<Student> student = new ArrayList<>();
		student.add(new Student(teacher.get(0),"Trump", "9"));
		student.add(new Student(teacher.get(1),"Bill", "9.8"));
		Student.printStudent(student);

		System.out.println("// Bounded Wildcards (<? extends Type>)");

		List<? extends Person> personList1 = new ArrayList<>(people);
		for (Person person : personList1) {
			System.out.println(person);
		}
		List<? extends Person> teacherList2 = new ArrayList<>(teacher);
		for (Person person : teacherList2) {
			System.out.println(person);
		}
		List<? extends Person> studentList3 = new ArrayList<>(student);
		for (Person person : studentList3) {
			System.out.println(person);
		}
		
		//Lower Bounded Wildcards (<? super type>)
		   List<? super Teacher> pL1 = new ArrayList<Person>();
		   pL1.add(new Teacher("Narendra Modi", "Physics"));
		   pL1.add(new Teacher("Alex Pandian", "Chemistry"));
		   
		   for (Object obj : pL1) {
	            if (obj instanceof Teacher) {
	                Teacher teach = (Teacher) obj;
	                System.out.println("Hii--Teacher: " + teach.getName() + ", Subject: " + teach.getSubject());
	            }
	        }
		   
		   
		   List<? super Student> sL1 = new ArrayList<Teacher>();
		   sL1.add(new Student(teacher.get(0), "Bill Gates", "9.8"));
		   sL1.add(new Student(teacher.get(1), "Nirmal", "9"));
		   
		   for(Object t : sL1) {
			   if(t instanceof Student) {
				   Student std = (Student) t;
				   System.out.println("Hi-->"+ teacher.get(1) +", Student: "+std.getSname()+", Grade: "+std.getGrade());
			   }
			   
		   }
	}
}
