package OOP;

public class Demo {

	public static void main(String[] args) {
		Shape circle = new Circle("Circle", 5);
		System.out.println(circle.name); // Should print "Circle"

		Shape triangle = new Triangle("Triangle", 4, 5, 6, 4);

		System.out.println("Circle area : " + circle.getArea());
		System.out.println("Circle perimeter : " + circle.getPerimeter());
		System.out.println("Triangle area : " + triangle.getArea());
		System.out.println("Triangle perimeter : " + triangle.getPerimeter());
	}
}
