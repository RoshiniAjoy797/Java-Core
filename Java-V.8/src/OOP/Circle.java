package OOP;
public class Circle extends Shape {
	private static final double pi = 3.14;
	private final double radius;

	protected Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	protected double getArea() {
		return pi * Math.pow(radius, 2);
	}

	@Override
	protected double getPerimeter() {
		return 2 * pi * radius;
	}

}
