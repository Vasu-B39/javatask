package com.xworkz.application.app.repository;

import com.xworkz.application.app.CarDTO;

public interface CarRepository {

		public void save(CarDTO dto);
		
		public boolean isExist(CarDTO dto);
		
		public CarDTO findByName(String name);

}
