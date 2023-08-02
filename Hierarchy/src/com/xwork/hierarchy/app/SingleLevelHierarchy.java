package com.xwork.hierarchy.app;

public class SingleLevelHierarchy extends Hierarchy {

	String type;
	
	public void Root(String type) 
	 { 
		
		System.out.println("Invoke the no-arg in SingleLevelHierarchy");
		this.type=type;
		System.out.println("Root is "+this.type);
	}
	

}
