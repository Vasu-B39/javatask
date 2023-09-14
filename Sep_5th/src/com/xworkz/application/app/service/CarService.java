package com.xworkz.application.app.service;

import com.xworkz.application.app.CarDTO;

public interface CarService {
	
		public boolean validateAndSave(CarDTO dto);
	   public boolean findByName(String name);

}
