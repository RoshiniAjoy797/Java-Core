package Generics;

public class GenericClass<T> {

	/*
	 * Generic Naming Conventions As for the naming convention, according to
	 * oracle docs, you should use single and uppercase letters, so it will be easy
	 * to differentiate a type variable and an ordinary class or interface name.
	 * The most commonly used type parameter names are:
	 * E – Element (used extensively by the Java Collections Framework) 
	 * K – Key 
	 * N - Number 
	 * T – Type 
	 * V – Value 
	 * S,U,V etc. – 2nd, 3rd, 4th types
	 */
	
	private T value;

	public void setValue(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	/*
	 * Generic method :: is a method that can operate on different types of data. It
	 * is defined with its own type parameter(s) and can be used independently of
	 * the class’s type parameter. The type parameter is specific to the method and
	 * does not affect the rest of the class.
	 */
	
	public <T> void print(T param) {
		System.out.println(param.getClass().getName() + " = " + param);
	}

}
