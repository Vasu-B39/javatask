package com.association.boot;

import com.association.app.reporetary.MedicineResporetaryIMPL;
import com.association.app.repository.ArtistRepositaryImpl;
import com.association.app.repository.GroceryRepository;
import com.association.app.repository.GroceryRepositoryImpl;
import com.association.app.repository.PoliticianRepositaryImpl;
import com.association.app.service.GroceryServiceImpl;
import com.association.app.service.PoliticianServiceImpl;
import com.association.app.servici.ArtistServiceImpl;
import com.association.app.servive.MedicineServiceImpl;

public class Runner1 {
	
	public static void main(String[] args) {
		
		GroceryRepository  repo=new GroceryRepositoryImpl();
		GroceryServiceImpl g=new GroceryServiceImpl(repo);
		g.validAndService(null);
		g.validAndService("bread");
		g.validAndService("bun");
		
		System.out.println("====================================");
		
		MedicineResporetaryIMPL m=new MedicineResporetaryIMPL();
		MedicineServiceImpl m1=new MedicineServiceImpl(m);
		m1.validationAndSave(null);
		m1.validationAndSave("capsule");
		m1.validationAndSave("capsule");
		m1.validationAndSave("cp");
		
		System.out.println("====================================");
		
		ArtistRepositaryImpl arter=new ArtistRepositaryImpl();
		
		
		System.out.println("====================================");
		PoliticianRepositaryImpl p=new PoliticianRepositaryImpl();
		PoliticianServiceImpl p1=new PoliticianServiceImpl(p);
		p1.validAndSave(null);
		p1.validAndSave("BS yedurappa");
		p1.validAndSave("yogi");
		p1.validAndSave("modi");
		
	}

}
