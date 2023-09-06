package com.association.app.service;

import com.association.app.repository.GroceryRepository;

public class GroceryServiceImpl implements GroceryService {
	
	private GroceryRepository groceryRepository;
	
	public  GroceryServiceImpl(GroceryRepository groceryRepository) {
		
		this.groceryRepository=groceryRepository;
	}
	
	@Override
	public boolean validExists(String name) {
		
		return false;
	}
	
	@Override
	public boolean validAndService(String name) {
		
		if(name !=null && !name.isEmpty() && name.length()>=3  && name.length()<=10) 
		{
			System.out.println("Data is valid ");
			this.groceryRepository.store(name);
			return true;
		}
		else
		{
			System.out.println("Data is invalid");
		}
		
		return false;
	}

	

	

}
