package com.umbrela.app;

public class Umbrella {
	
	public String sizeType;
	public String color;
	public double price;
	public boolean foldable;
	
	public void chatri()
	{
		System.out.println("invoking the no-arg in chatri");
		chatri("medium");
		chatri("medium", "blue");
		chatri("medium", "blue", 150);
		chatri("medium", "blue", 150, true);
	}
	
	public void chatri(String sizeType)
	{
		System.out.println("invoking the string-arg in chatri");
		this.sizeType=sizeType;
	}
	
	public void chatri(String sizeType, String color)
	{
		System.out.println("invoking the string-arg in chatri");
		this.color=color;
	}
	
	public void chatri(String sizeType, String color, double price)
	{
		System.out.println("invoking the string & double arg in chatri");
		this.price=price;
	}
	
	public void chatri(String sizeType, String color, double price, boolean foldable)
	{
		System.out.println("invoking the string & double arg in chatri");
		this.foldable=foldable;
		
		System.out.println("umbrella size type is "+sizeType);
		System.out.println("umbrella color is "+color);
		System.out.println("umbrella price is "+price);
		System.out.println("umbrella is foldable "+foldable);
		
	}

}
