package com.xwork.hierarchy.app;

public class FourLevelHierarchy extends Hierarchy {

	String type;
	
	public void Flower(String type) 
	 { 
		
		System.out.println("Invoke the no-arg in FourLevelHierarchy");
		this.type=type;
		System.out.println("Flower is "+this.type);
	}
}
