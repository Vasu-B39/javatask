package com.ironbox.app;

public class IronBox {
	
	public String brand;
	public boolean option;
	public int range;
	public String type;
	
	    public void Box()
		{
			System.out.println("invoke box in the no-arguments");
			Box("Bazaz");
			Box("Bazaz", true);
			Box("Bazaz", true, 250);
			Box("Bazaz", true, 250, "light weight");
			
		}
	    
	    public void Box(String brand)
	    {
	    	System.out.println("invoke box in the string and boolean-arguments");
	    	this.brand=brand;
	    }
	    
	    public void Box(String brand, boolean option)
	    {
	    	System.out.println("invoke box in the string and boolean-arguments");
	    	this.option=option;
	    }
	    
	    public void Box(String brand, boolean option, int range)
	    {
	    	System.out.println("invoke box in the string, boolean and long-arguments");
	    	this.range=range;
	    }
	    
	    public void Box(String brand, boolean option, int range, String type)
	    {
	    	System.out.println("invoke box in the string, boolean and long-arguments");
	    	this.type=type;
	    	System.out.println("Iron Box brand is "+brand);
	    	System.out.println("Iron Box in auto set option available "+option);
	    	System.out.println("Iron Box is heat up to "+range +"celcius");
	    	System.out.println("Iron Box is "+type);
	    	
	    }
	}
	


