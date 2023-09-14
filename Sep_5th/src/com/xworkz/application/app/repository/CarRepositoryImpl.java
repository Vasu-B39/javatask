package com.xworkz.application.app.repository;

import com.xworkz.application.app.CarDTO;

public class CarRepositoryImpl implements CarRepository {
	
	CarDTO[] cars=new CarDTO[10];
	private int position;

	@Override
	public void save(CarDTO dto) {
		
		//check position and validation
		if(this.position<10)
		{
			System.out.println(dto+" is Valid and its position "+position);
			this.cars[position]=dto;
			this.position++;
		}
		else
		{
			System.out.println("It is out of Storage");
		}

	}

	@Override
	public boolean isExist(CarDTO dto) {
		
		for(int index=0; index<=this.position; index++)
		{
			CarDTO temp=cars[index];
			if(temp !=null && temp.equals(dto))
			{
				System.out.println("This name is already Exists");
				return true;
			}
			else
			{
				System.out.println("name is not exists");
			}
		}
		return false;
	}

	@Override
	public CarDTO findByName(String name) {
		for(int index=0; index<this.position; index++)
		{
			CarDTO dtos=cars[index];
			if(dtos.getcarName().equals(name))
			{
				System.out.println("It is found");
				return dtos;
			}
			else
			{
				System.out.println("its not found");
			}
			
		}
		return null;
	}

}
