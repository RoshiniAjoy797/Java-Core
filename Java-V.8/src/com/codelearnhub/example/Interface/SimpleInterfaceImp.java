package com.codelearnhub.example.Interface;

public class SimpleInterfaceImp implements IsimpleInterface {

	@Override
	public void printHelloLanguage(String language) {
		switch (language) {
		case "English":
			System.out.println("Hello");
			break;
		case "Tamil":
			System.out.println("வணக்கம்");
			break;
		case "Hindi":
			System.out.println("नमस्ते");
			break;
		}
	}

	@Override
	public void sayHello() {
		IsimpleInterface.super.sayHello();
		System.out.println("Hi again");

	}
}
