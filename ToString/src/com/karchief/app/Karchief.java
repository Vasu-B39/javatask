package com.karchief.app;

public class Karchief {
	private String color;
	private String material;
	private double cost;
	private boolean madeInIndia;
	private int height;
	private int width;
	private boolean isGoodQuality;

	

	public Karchief(String color, String material, double cost, boolean madeInIndia, int height, int width,
			boolean isGoodQuality) {
		super();
		this.color = color;
		this.material = material;
		this.cost = cost;
		this.madeInIndia = madeInIndia;
		this.height = height;
		this.width = width;
		this.isGoodQuality = isGoodQuality;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return color +"\n"+material+"\n"+cost+"\n"+madeInIndia+"\n"+height+"\n"+width+"\n"+isGoodQuality;
	}
}