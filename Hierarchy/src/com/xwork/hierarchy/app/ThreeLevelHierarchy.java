package com.xwork.hierarchy.app;

public class ThreeLevelHierarchy extends  Hierarchy {
	
	String type;
	public void Stem(String type)
	{
		System.out.println("Invoke the no-arg in ThreeLevelHierarchy");
		this.type=type;
		System.out.println("Stem is "+this.type);
	}

}
