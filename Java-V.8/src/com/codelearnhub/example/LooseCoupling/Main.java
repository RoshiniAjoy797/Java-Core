package com.codelearnhub.example.LooseCoupling;

import java.io.CharArrayWriter;

public class Main {
	public static void main(String[] args) {
		/*
		 * you can create different types of cars with different engines. By simply
		 * injecting either a DieselEngine or an ElectricEngine into the Car, you get a
		 * car that behaves differently depending on the engine type
		 */
		Engine dieselEngine = new DieselEngine();
		Car carWithDieselEngine = new Car(dieselEngine);
		carWithDieselEngine.start();

		Engine electricEngine = new ElectricEngine();
		Car carWithElectricEngine = new Car(electricEngine);
		carWithElectricEngine.start();
	}
}
