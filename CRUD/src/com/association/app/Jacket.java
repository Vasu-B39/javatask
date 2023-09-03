package com.association.app;

public class Jacket implements Men{
	
	String[] leather=new String[TOTAL_JACK];
	int type;

	@Override
	public void brand(String leather) {
	this.leather[type]=leather;
	
	   if(this.type>TOTAL_JACK)
	   {
		System.out.println("valid index");
	    }
	   else 
	   {
		System.out.println("in-valid index");
	}
	   this.type++;
	   System.out.println("Jackets brand is "+leather +" position "+type);
	}

}
