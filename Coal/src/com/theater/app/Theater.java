package com.theater.app;

public class Theater {
	
     public void online1() {
		
		System.out.println("Invoking in the online with no-arg");
		
	}
	
	public void qrCode1() {
		System.out.println("Invoking in the qrCode with no-arg");
		online1();
	}

}
