package com.association.app;

public class Pilot implements AirLine{
	
	String[] plane1=new String[TOTAL_PILOT];
	int port;

	@Override
	public void airlins(String plane1) {
		this.plane1[port]=plane1;
		
		if(this.port<TOTAL_PILOT)
		{
			System.out.println("valid index");
		}
		else 
		{
			System.out.println("In-valid index");
		}
		this.port++;
		System.out.println("plane name "+ plane1 +"no of plane is "+port);
		
		
	}

}
