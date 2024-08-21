package Generics;

import java.util.*;

public class GenericWildcards {
	/*
	 * Unbounded Wildcards (?): Accepts any type.
	 * Bounded Wildcards (<? extends Type>): Accepts a type and its subclasses. 
	 * Lower Bounded Wildcards (<? super type>): Accepts a type and its super classes.
	 */

	public static void printList(List<?> list) {
		for (Object elem : list) {
			System.out.println(elem);
		}
	}
}
