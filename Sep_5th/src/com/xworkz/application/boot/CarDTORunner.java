package com.xworkz.application.boot;

import com.xworkz.application.app.CarDTO;
import com.xworkz.application.app.repository.CarRepository;
import com.xworkz.application.app.repository.CarRepositoryImpl;
import com.xworkz.application.app.service.CarService;
import com.xworkz.application.app.service.CarServiceImpl;

public class CarDTORunner {

	public static void main(String[] args) {
		
		CarRepository repos=new CarRepositoryImpl();
		CarService ev=new CarServiceImpl(repos);
		
		CarDTO show=new CarDTO("Scorpio-N",14);
		CarDTO show1=new CarDTO("XUV-700",22);
		
		ev.validateAndSave(show);
		ev.validateAndSave(show1);
		ev.findByName("Scorpio-N");
		ev.findByName("swift");

	}

}
