package com.codelearnhub.example.LooseCoupling;

public class Car {
	private Engine engine;

	public Car(Engine engine) {
		this.engine = engine;
	}
	public void start() {
		engine.start();
	}

}
