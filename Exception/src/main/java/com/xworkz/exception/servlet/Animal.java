package com.xworkz.exception.servlet;

public class Animal {
	
	public void lion(){
		System.out.println("Animal lion");
		try {
			tiger();
		} catch (Exception e) {
			//e.printStackTrace();
			System.err.println("Exception event is handled");
		}
		System.out.println("After Handling");
	}
	
	public void tiger(){
		cheeta();
		System.out.println("Animal tiger");
	}

	public void cheeta(){
		wolf();
	System.out.println("Animal cheeta");
	}
	
	public void wolf(){
		 elephant();
	System.out.println("Animal wolf");
	}
	
	public void elephant(){
	System.out.println("Animal elephant");
	throw new RuntimeException();

	}
	
}
