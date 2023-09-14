package com.xworkz.application.app.service;

import com.xworkz.application.app.CarDTO;
import com.xworkz.application.app.repository.CarRepository;

public class CarServiceImpl implements CarService {
	
	private CarRepository carRepository;
	

	public CarServiceImpl(CarRepository carRepository) {
		this.carRepository=carRepository;
	}

	@Override
	public boolean validateAndSave(CarDTO dto) {
		if(dto!=null)
		{
			System.out.println("dto is null,so can't it store");
			carRepository.isExist(dto);
			
			if(carRepository.isExist(dto)==false)
			{
				System.out.println("it's starts to store");
				carRepository.save(dto);
			}
			else
			{
				System.out.println("sry it can't be stored");
			}
		}
	
		return false;
	}

	@Override
	public boolean findByName(String name) {
		if(name!=null && !name.isEmpty())
		{
			System.out.println("the name is found");
			carRepository.findByName(name);
			return true;
		}
		else
		{
			System.out.println("thank you");
		}
		
		return false;
	}

}
