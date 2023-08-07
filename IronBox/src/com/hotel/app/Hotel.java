package com.hotel.app;

public class Hotel {
	
	public String name;
	public double price;
	public String item;
	public String type;
	
	public void food()
	{
		System.out.println("invoking food with no-args");
		food("veg");
		food("veg", "Dosa");
		price=40;
		food("veg", "Dosa", 40, "Mallikarjuna hotel");
	}
	
	public boolean food(String type)
	{
		System.out.println("invoking food with String args");
		
		this.type=type;
		
		return false;
	}
	
	public void food(String type, String item)
	{
		System.out.println("invoking food with Strings args");
		this.item=item;
	}
	
	public void food(String type, String item, double price)
	{
		System.out.println("invoking food with Strings args");
		this.price=price;
		System.out.println("");
	}
	
	public void food(String type, String item, double price, String name)
	{
		System.out.println("invoking food with Strings args");
		this.name=name;
		
		System.out.println("hotel name is " +name);
		System.out.println("hotel type  is "+type);
		System.out.println("hotel in order item  is "+item);
		System.out.println("hotel in item price is "+price);
	}

}
