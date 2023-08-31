package com.xwork.associationimpl.app;

public class Browser {
	public Internet internet;
	
	public void speed() {
		System.out.println("Invoking Browser in speed");
	}
	
	public void setSpeed(Internet internet) {
		this.internet.connect();
		System.out.println("Invoking Browser in setSpeed");
		
	}
	

}
