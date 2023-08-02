package com.xwork.hierarchy.app;

public class EightLevelHierarchy extends Hierarchy {

	String type;
	
	public void Soil(String type) 
	 { 
		
		System.out.println("Invoke the no-arg in EightLevelHierarchy");
		this.type=type;
		System.out.println("Soil is "+this.type);
	}

}
