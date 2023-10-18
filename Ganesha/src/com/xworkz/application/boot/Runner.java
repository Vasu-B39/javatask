package com.xworkz.application.boot;

import com.xworkz.ganesha.Cars;
import com.xworkz.ganesha.repositary.CarsRepositary;
import com.xworkz.ganesha.repositary.CarsRepositaryImpl;
import com.xworkz.ganesha.service.CarsService;
import com.xworkz.ganesha.service.CarsServiceImpl;

public class Runner {

	public static void main(String[] args) {
		CarsRepositary repos=new CarsRepositaryImpl();
		CarsService serve=new CarsServiceImpl(repos);
		
		Cars car1=new Cars("Maruthi", "Swift", 1200000l, "Disel", 5, true, false, 5, "advance", true);
		Cars car2=new Cars("Mahindra", "Scorpio", 1300000l, "Disel", 5, true, false, 5, "advance", true);	
		Cars car3=new Cars("Mahindra black", "thara", 1280000l, "petrol", 5, true, false, 5, "Normal", true);
		
		serve.validAndSave(car3);
		serve.validAndSave(car1);
		serve.validAndSave(car2);
		serve.validAndSave(null);
		
	}

}
