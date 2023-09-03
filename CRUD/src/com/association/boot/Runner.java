package com.association.boot;

import com.association.app.Artist;
import com.association.app.GroceryRespImpl;
import com.association.app.HistoricalPlaces;
import com.association.app.Jacket;
import com.association.app.Medicine;
import com.association.app.Painter;
import com.association.app.Patient;
import com.association.app.Pilot;
import com.association.app.Politician;

public class Runner {
	
	public  static void main(String[] args) {
		
	
		Artist d=new Artist();
		
		d.sketchs("sculture");
		d.sketchs("painter");
		d.sketchs("pencit");
		d.sketchs("ceramic");
		
		
		System.out.println("=====================");
		
		Jacket jacket=new Jacket();
		
		jacket.brand("puma");
		jacket.brand("nike");
		jacket.brand("genue leather");
		jacket.brand("cotton");
		jacket.brand("puffer");
		
		System.out.println("=====================");
		
		Patient patient=new Patient();
		
		patient.wards("doctor1");
		patient.wards("doctor2");
		patient.wards("doctor3");
		patient.wards("doctor4");
		patient.wards("doctor5");
		
		System.out.println("=====================");
		
		Politician politician=new Politician();
		
		politician.mla("B S yedurappa");
		politician.mla("Bommai");
		politician.mla("Parmeshwar");
		politician.mla("sumalatha");
		politician.mla("eshwarappa");
		
		System.out.println("=====================");
		
	   GroceryRespImpl store=new GroceryRespImpl();
	   
				store.save("badam");
				store.save("almod");
				store.save("pista");
				store.save("milk");
				store.save("dry grape");
				store.save("mango");
				store.save("orange");
				store.save("lemon");
				store.save("lemon");
				store.save("lemon");
				
				System.out.println("=====================");
				
				HistoricalPlaces place=new HistoricalPlaces();
				
				place.places("shivamogga");
				place.places("mysore");
				place.places("chitrudurga");
				place.places("badam");
				place.places("hampi");
				
				System.out.println("=====================");
				
				Pilot pilot=new Pilot();
				
				pilot.airlins("indigo");
				pilot.airlins("king Fisher");
				pilot.airlins("airline");
				pilot.airlins("indian");
				pilot.airlins("airline2");
				
				System.out.println("=====================");
				
				Medicine med=new Medicine();
				
				med.medical("b-complex");
				med.medical("zuno");
				med.medical("sumo");
				med.medical("capsule-e");
				med.medical("astrio");
				
				
	}

}

