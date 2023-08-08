package com.ticket.app;

public class Ticket {
	
public void online() {
		
		System.out.println("Invoking in the online with no-arg");
		
	}
	
	public void qrCode() {
		System.out.println("Invoking in the qrCode with no-arg");
		online();
	}


}
