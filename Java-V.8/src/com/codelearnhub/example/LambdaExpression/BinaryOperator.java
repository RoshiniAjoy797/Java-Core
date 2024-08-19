package com.codelearnhub.example.LambdaExpression;

import java.util.function.BiFunction;

@FunctionalInterface
public interface BinaryOperator<T> extends BiFunction<T, T, T> {
	/*
	 * represents an operation on two operands of the same type, producing a result
	 * of the same type 'T'.
	 */
	T apply(T t1, T t2);
	
}
