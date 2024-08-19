package com.codelearnhub.example.Interface;

public class BoatImp implements IDrivable { //Service

	@Override
	public void printNumberOfWheels() {
		System.out.println("Boat has no wheel");
	}

	@Override
	public void printTypeOfFuel() {
		System.out.println("Boat mainly uses gas and diesel");
	}
	@Override
	public void canBeDrivenOn() {
		System.out.println("Sea");
	}

	@Override
	public void drive() {
System.out.println("Rowing a boat..");		
	}

}
