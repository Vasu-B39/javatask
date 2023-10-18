package com.xworkz.ganesha.repositary;

import com.xworkz.ganesha.Cars;

public interface CarsRepositary {
	
    int TOTAL_CARS=10;
	
	public void save(Cars store);
	public boolean isExists(Cars store);
	Cars findByName(String name);


}
