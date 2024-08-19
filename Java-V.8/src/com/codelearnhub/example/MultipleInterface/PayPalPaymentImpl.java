package com.codelearnhub.example.MultipleInterface;

public class PayPalPaymentImpl implements IPayable {

	@Override
	public void processPayment(double amount) {
		System.out.println("Processing credit card payment of rs. " + amount);
	}
}
