package com.abstraction.boot;

import com.abstraction.app.Tata;
import com.abstraction.app.TataConsurtancy;

public class TataRunner {
	
	public static void main(String[] args)
	{
		System.out.println("Invoking Main in hta runner");
		
		Tata tata=new TataConsurtancy();
		tata.bike();
		tata.car();
		tata.design();
		tata.electricCar();
		tata.packet();
		tata.process();
		tata.run();
		tata.salt();
		tata.speed();
	
	}
	

}
