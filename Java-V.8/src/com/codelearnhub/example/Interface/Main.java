package com.codelearnhub.example.Interface;

public class Main {
	public static void main(String[] args) {
		CarImpl c = new CarImpl();
		IDrivable.sayHelloFrom("Car");// static reference
		c.setColor("White");
		c.printColor();
		c.printNumberOfWheels();
		c.canBeDrivenOn();
		// c.canBeDrivenOn();
		IDrivable car = new CarImpl();
		car.canBeDrivenOn();
		IDrivable boat = new BoatImp();
		IDrivable.sayHelloFrom("Boat");// can't make static reference to non-static refernce
		boat.printNumberOfWheels();
		boat.printTypeOfFuel();
		boat.canBeDrivenOn();

//Calling Interface & Class methods
		IsimpleInterface simInt = new SimpleInterfaceImp();
		System.out.println("Calling sayHello() method :");
		simInt.sayHello();
		
		System.out.println("Calling printHelloLanguage() method :");
		simInt.printHelloLanguage("Tamil");System.out.println();
		
		System.out.println("Calling sayBye() method :");
		IsimpleInterface.sayBye();System.out.println();
		
		System.out.println("calling sayByeMultipletimes() :");
		IsimpleInterface.sayByeMultipleTimes();

	}

}
