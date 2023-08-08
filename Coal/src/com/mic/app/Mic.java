package com.mic.app;

public class Mic {
	public void wireless() {
		
		System.out.println("Invoking in the wireLess with no-arg");
		
	}
	
	public void wired() {
		System.out.println("Invoking in the wired with no-arg");
		wireless();
	}

}
