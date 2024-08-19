package com.codelearnhub.example.MultipleInterface;

public class OrderImpl implements IOrderable, INotifiable {

	private String orderId;
	private double orderAmount;

	public OrderImpl(String orderId, double orderAmount) {
		this.orderId = orderId;
		this.orderAmount = orderAmount;
	}

	public double getOrderAmount() {
		return this.orderAmount;
	}

	@Override
	public void placeOrder() {
		System.out.println("Order placed : " + orderId + " for amount rs." + orderAmount);
	}

	@Override
	public void cancelOrder() {
		System.out.println("Order canceled : " + orderId);
	}

	@Override
	public void sendNotification(String message) {
		System.out.println("Notification sent for order  " + orderId + ". " + message);
	}
}
