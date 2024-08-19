package com.codelearnhub.example.FunctionalInterface;

/*  Functional Interfaces were introduced in Java 8
 *  and these Interfaces are annotated with @FunctionalInterface annotation. 
 *  By definition, a Functional Interface is an Interface that has exactly one abstract method. 
 *  This means that it can have as many static and default methods as possible and still be 
 *  considered a Functional Interface. Furthermore, you can implement a Functional Interface by using a Lambda Expression, 
 *  a Method reference, or a Constructor reference.
 */
// Custom functional interface

@FunctionalInterface
public interface TriFunction<T, U, Q, R> {
	R apply(T t,U u, Q q);
	
}
