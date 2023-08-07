package com.stapler.app;

public class Stapler {
	public String sizeType;
	public String color;
	public double price;
	public boolean bigStepling;
	
	public void pinHodiyodu()
	{
		System.out.println("invoking the no-arg in bigStepling");
		pinHodiyodu("medium");
		pinHodiyodu("medium", "silver");
		pinHodiyodu("medium", "blue", 100);
		pinHodiyodu("medium", "blue", 100, false);
	}
	
	public void pinHodiyodu(String sizeType)
	{
		System.out.println("invoking the string-arg in bigStepling");
		this.sizeType=sizeType;
	}
	
	public void pinHodiyodu(String sizeType, String color)
	{
		System.out.println("invoking the string-arg in bigStepling");
		this.color=color;
	}
	
	public void pinHodiyodu(String sizeType, String color, double price)
	{
		System.out.println("invoking the string & double arg in bigStepling");
		this.price=price;
	}
	
	public void pinHodiyodu(String sizeType, String color, double price, boolean bigStepling)
	{
		System.out.println("invoking the string & double arg in big stepling");
		this.bigStepling=bigStepling;
		
		System.out.println("stepler size type is "+sizeType);
		System.out.println("stepler color is "+color);
		System.out.println("stepler price is "+price);
		System.out.println("Stepling as to big books or papers "+bigStepling);
		
	}

}
