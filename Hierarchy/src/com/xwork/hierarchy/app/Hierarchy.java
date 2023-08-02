package com.xwork.hierarchy.app;

public class  Hierarchy {
	
	String name;
	
	public void Tree(String name)
	{

		System.out.println("Tree name is "+name);
		this.name=name;
	}

	public void Root(String type) {
		
	}
	public void Leaf(String status) {}
	
	public void Stem(String type) {}
	
	public void Flower(String type) {}
	
	public void Fruit(String type) {}
	
	public void Bud(String type) {}
	
	public void Seed(String type) {}
	
	public void Soil(String type) {}

}
