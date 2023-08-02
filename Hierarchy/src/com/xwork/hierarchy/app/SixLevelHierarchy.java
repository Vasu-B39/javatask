package com.xwork.hierarchy.app;

public class SixLevelHierarchy extends Hierarchy {

	String type;
	
	public void Bud(String type) 
	 { 
		
		System.out.println("Invoke the no-arg in SixLevelHierarchy");
		this.type=type;
		System.out.println("Bud is "+this.type);
	}

}
