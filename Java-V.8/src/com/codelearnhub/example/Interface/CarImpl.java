package com.codelearnhub.example.Interface;

public class CarImpl implements IDrivable {//Service
	private String color;

	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}

	@Override
	public void printNumberOfWheels() {
		System.out.println("Car has 4 wheel");
	}

	@Override
	public void printTypeOfFuel() {
		System.out.println("Car mainly uses Gas");
	}
 
	public void printColor() {
		System.out.println("The color of car is "+ color);
	}
	@Override
	public void drive() {
		System.out.println("Driving a car..");
	}
}
