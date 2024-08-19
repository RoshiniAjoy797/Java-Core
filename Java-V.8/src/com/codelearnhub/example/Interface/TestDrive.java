package com.codelearnhub.example.Interface;

public class TestDrive { // consumer

	public static void main(String[] args) {
		IDrivable car = new CarImpl();
		IDrivable boat = new BoatImp();
		driveVehicle(car);
		driveVehicle(boat);
		car.drive();// direct calling
		boat.drive();

		Runnable runnable = () -> System.out.println("Hello, World!");
		runnable.run(); // Output: Hello, World!

	}

	/*
	 * Polymorphic Method Call.This show cases polymorphism, where the method
	 * execution is determined by the actual type of the object at runtime (either
	 * CarImpl or BoatImp).
	 */
	public static void driveVehicle(IDrivable vehicle) {
		vehicle.drive();
	}

}
