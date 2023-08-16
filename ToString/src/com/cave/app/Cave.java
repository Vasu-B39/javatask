package com.cave.app;

public class Cave {
	private String material;
	private int deep;
	private int width;
	private boolean isSafe;
	private boolean isInAnimals;
	private String food;
	private String location;
	private boolean isInZoo;
	private int noOfAnimal;
	private String animalName;

	
	public Cave(String material, int deep, int width, boolean isSafe, boolean isInAnimals, String food,
			String location, boolean isInZoo, int noOfAnimal, String animalName) {
		super();
		this.material = material;
		this.deep = deep;
		this.width = width;
		this.isSafe = isSafe;
		this.isInAnimals = isInAnimals;
		this.food = food;
		this.location = location;
		this.isInZoo = isInZoo;
		this.noOfAnimal = noOfAnimal;
		this.animalName = animalName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return material+"\n"+deep+"\n"+width+"\n"+isInZoo+"\n"+isInAnimals+"\n"+isSafe+"\n"+animalName+"\n"+food+"\n"+location+"\n"+noOfAnimal;
	}
}
 

