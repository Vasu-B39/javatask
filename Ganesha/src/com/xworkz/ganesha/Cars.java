package com.xworkz.ganesha;

import java.io.Serializable;

public class Cars implements Serializable{
	
	private String brand;
	private String model;
	private long price;
	private String type;
	private int ratings;
	private boolean emi;
	private boolean freeService;
	private int noOfseats;
	private String features;
	private boolean autoGareSystem;
	
	public Cars(String brand, String model, long price, String type, int ratings, boolean emi, boolean freeService, int noOfseats, String features, boolean autoGareSystem)
	{
		this.brand=brand;
		this.model=model;
		this.price=price;
		this.type=type;
		this.ratings=ratings;
		this.emi=emi;
		this.freeService=freeService;
		this.noOfseats=noOfseats;
		this.features=features;
		this.autoGareSystem=autoGareSystem;
	}

	@Override
	public String toString() {
		return "Cars [brand=" + brand + ", model=" + model + ", price=" + price + ", type=" + type + ", ratings="
				+ ratings + ", emi=" + emi + ", freeService=" + freeService + ", noOfseats=" + noOfseats + ", features="
				+ features + ", autoGareSystem=" + autoGareSystem + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getRatings() {
		return ratings;
	}

	public void setRatings(int ratings) {
		this.ratings = ratings;
	}

	public boolean isEmi() {
		return emi;
	}

	public void setEmi(boolean emi) {
		this.emi = emi;
	}

	public boolean isFreeService() {
		return freeService;
	}

	public void setFreeService(boolean freeService) {
		this.freeService = freeService;
	}

	public int getNoOfseats() {
		return noOfseats;
	}

	public void setNoOfseats(int noOfseats) {
		this.noOfseats = noOfseats;
	}

	public String getFeatures() {
		return features;
	}

	public void setFeatures(String features) {
		this.features = features;
	}

	public boolean isAutoGareSystem() {
		return autoGareSystem;
	}

	public void setAutoGareSystem(boolean autoGareSystem) {
		this.autoGareSystem = autoGareSystem;
	}

	public String getcarsName() {
		
		return null;
	}
	

}
