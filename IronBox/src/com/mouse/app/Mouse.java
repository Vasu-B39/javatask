package com.mouse.app;

public class Mouse {
	
	public String type;
	public String name;
	public long price;
	public boolean  wireless;
	
	public void electronics()
	{
		System.out.println("invoking electronics with no-args");
		
		electronics("computer");
		electronics("computer", "HP ");
		electronics("computer", "HP", 2400);
		electronics("computer","HP", 800, true);
	}
	
	public void electronics(String type)
	{
		System.out.println("invoking electronics with String-args");
		this.type=type;
	}	
	
	public void electronics(String type, String name)
	{
		System.out.println("invoking electronics with String-args");
		this.name=name;
	}	
	
	public void electronics(String type, String name, long price)
	{
		System.out.println("invoking electronics with String-args");
		this.price=price;
	}	
	
	public void electronics(String type, String name, long price, boolean  wireless)
	{
		System.out.println("invoking electronics with String-args");
		this.wireless=wireless;
		
		System.out.println("mouse  type is "+type);
		System.out.println("mouse name is "+name);
		System.out.println("mouse price is "+price);
		System.out.println("mouse is wire less "+wireless);
	}	

}
