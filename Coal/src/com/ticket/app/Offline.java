package com.ticket.app;

import com.ticket.app.Ticket;

public class Offline extends Ticket{
	
	@Override
	public void online() {
		// TODO Auto-generated method stub
		System.out.println("Invoking in the online override with Offline class as no-arg");
		
	}

}
