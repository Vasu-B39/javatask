package com.xwork.association.boot;

import java.awt.Button;
import java.awt.print.Paper;

import com.xwork.association.app.Bus;
import com.xwork.association.app.Laptop;
import com.xwork.association.app.Pant;
import com.xwork.association.app.Passenger;
import com.xwork.association.app.Shirt;
import com.xwork.association.app.Trainer;
import com.xwork.association.app.Wood;
import com.xwork.association.app.Zip;

public class Runner {

	public static void main(String[] args) {
		
		Laptop laptop=new Laptop();
		
		Trainer trainer=new Trainer("java");
		trainer.setName(laptop);
		System.out.println(trainer);
		
		
		System.out.println("==================================");
		
		Button button=new Button();
		Shirt shirt=new Shirt("Ramraj");
		System.out.println(shirt);
		shirt.setButton(null);
		
		System.out.println("==================================");
		
		Bus bus=new Bus();
		Passenger passenger=new Passenger("bmtc");
		System.out.println(passenger);
		passenger.setNo(bus);
		
		
		
		System.out.println("==================================");
		
		Zip zip=new Zip();

		Pant pant=new Pant("Flying Machine");
		System.out.println(pant);
		pant.setZip(zip);
		
		System.out.println("==================================");
		
		Paper paper=new Paper();

		Wood wood=new Wood("Sandal Wood");
		System.out.println(wood);
		wood.setQuality(paper);
		
		



	}

}
