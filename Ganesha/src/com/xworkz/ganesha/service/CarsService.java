package com.xworkz.ganesha.service;

import com.xworkz.ganesha.Cars;

public interface CarsService {
	
	public boolean validAndSave(Cars name);
	 public Cars findByBrandFeaturesModelType(String brand, String features, String model, String type);
	 public Cars findPriceRatingsNoOfSeats(long price, int ratings, int noOfSeats);
	public Cars findByName(String name);
	public Cars  findEmiFreeserviceAutogaresystem(boolean emi, boolean freeService, boolean autoGareSystem);

}
