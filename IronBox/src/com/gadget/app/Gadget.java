package com.gadget.app;

public class Gadget {
	
	public String type;
	public String name;
	public long price;
	public boolean  recylabele;
	
	public void electronics()
	{
		System.out.println("invoking electronics with no-args");
		
		electronics("Home Appliences");
		electronics("Home Appliences", "vacum cleaner");
		electronics("Home Appliences", "vacum cleaner", 2400);
		electronics("Home Appliences","vacum cleaner", 2400, true);
	}
	
	public void electronics(String type)
	{
		System.out.println("invoking electronics with nString-args");
		this.type=type;
	}	
	
	public void electronics(String type, String name)
	{
		System.out.println("invoking electronics with nString-args");
		this.name=name;
	}	
	
	public void electronics(String type, String name, long price)
	{
		System.out.println("invoking electronics with nString-args");
		this.price=price;
	}	
	
	public void electronics(String type, String name, long price, boolean  recylabele)
	{
		System.out.println("invoking electronics with nString-args");
		this.recylabele=recylabele;
		
		System.out.println("gadget  type is "+type);
		System.out.println("gadjet name is "+name);
		System.out.println("gadget price is "+price);
		System.out.println("gadget is recylabele "+recylabele);
	}	


}
