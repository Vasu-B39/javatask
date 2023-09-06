package com.association.app.service;

import com.association.app.repository.PoliticianRepositary;
import com.association.app.repository.PoliticianRepositaryImpl;

public class PoliticianServiceImpl implements PoliticianService{
	
	public PoliticianRepositary politicianRepositary;
	
	public PoliticianServiceImpl(PoliticianRepositary politicianRepositary) {
		this.politicianRepositary=politicianRepositary;
	}

	

	@Override
	public boolean validAndSave(String name) {
		System.out.println("this.getClass(), this.PoliticianService()");
		
		if(name !=null && !name.isEmpty() && name.length()>=3 && name.length()<=10) {
			System.out.println("valid");
			this.politicianRepositary.store(name);
		}
		else {
			System.out.println("In-Valid");
		}
		return false;
	}
	
	

}
