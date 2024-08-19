package OOP;

public abstract class Shape {
	protected static String name;

	protected Shape(String name) {
		this.name = name;
	}

	protected abstract double getArea();

	protected abstract double getPerimeter();

	protected void printName() {
		System.out.println(name);
	}

}
