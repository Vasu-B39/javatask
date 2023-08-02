package com.xwork.hierarchy.app;

import com.xwork.hierarchy.app.Hierarchy;



public class HierarchyRunner {
	
	public static void main(String[] args)
	{
		System.out.println("invoke main in the HierarchyRunner");
		Hierarchy hierarchy=new Hierarchy();
		hierarchy.Tree("mango");
		Hierarchy hierarchy1=new SingleLevelHierarchy();
		hierarchy1.Root("Plant base");
		Hierarchy hierarchy2=new TwoLevelHierarchy();
		hierarchy2.Leaf("kitchen of plant");
		Hierarchy hierarchy3=new ThreeLevelHierarchy();
		hierarchy3.Stem("Main part of plant");
		Hierarchy hierarchy4=new FourLevelHierarchy();
		hierarchy4.Flower("1st stage of fruit");
		Hierarchy hierarchy5=new FiveLevelHierarchy();
		hierarchy5.Fruit("Seed genaretot");
		Hierarchy hierarchy6=new SixLevelHierarchy();
		hierarchy6.Bud("Multi stem jiont");
		Hierarchy hierarchy7=new SevenLevelHierarchy();
		hierarchy7.Seed("Germination of plant");
		Hierarchy hierarchy8=new EightLevelHierarchy();
		hierarchy8.Soil("help for plant growing");
	}
	

}
