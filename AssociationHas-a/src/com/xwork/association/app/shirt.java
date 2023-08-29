package com.xwork.association.app;

public class Shirt {

	private String brand;
	private Button shape;

	public Shirt(String brand) {
		this.brand=brand;
	}

	public void setButton(Button shape) {
		this.shape=shape;
	}

	public void design()
	{
		System.out.println("invoking design in Shirt");
		this.shape.safety();
	}
}