package com.codelearnhub.example.MultipleInterface;

public class ShippingImpl implements IShippable {
	private String carrier;

	public ShippingImpl(String carrier) {
		super();
		this.carrier = carrier;
	}

	@Override
	public void shipOrder() {
		System.out.println("Order Shipped via : " + carrier);
	}
}
