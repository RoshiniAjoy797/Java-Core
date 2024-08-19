package com.codelearnhub.example.staticKeyword;

public class Test {
	public static void main(String[] args) {
		new Counter();
		Counter.count = 1;
		System.out.println(Counter.count);
	}
}
