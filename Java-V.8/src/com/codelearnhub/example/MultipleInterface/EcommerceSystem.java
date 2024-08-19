package com.codelearnhub.example.MultipleInterface;

public class EcommerceSystem {
	public static void main(String[] args) {
		// create an order
		OrderImpl order = new OrderImpl("ICS7856", 249.00);
		order.placeOrder();

		// Notify customer about order placement
		order.sendNotification("Your order has bee placed successfully.");

		// Process payment via credit card
		IPayable payment = new CreditcardPaymentImpl();
		payment.processPayment(order.getOrderAmount());

		// Ship the order via FedEx
		IShippable shipping = new ShippingImpl("FedEx");
		shipping.shipOrder();

		// Notify customer about shipping
		order.sendNotification("Your order has been shipped.");

	}
}
