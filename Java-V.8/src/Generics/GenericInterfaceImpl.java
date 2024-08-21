package Generics;

public class GenericInterfaceImpl<T> implements GenericInterface<T> {

	@Override
	public void display(T value) {
		System.out.println(value);
	}

}
