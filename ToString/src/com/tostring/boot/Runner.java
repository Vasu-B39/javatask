package com.tostring.boot;

import com.cave.app.Cave;
import com.karchief.app.Karchief;
import com.pendent.app.Pendent;
import com.tostring.app.Logo;
import com.tostring.app.LogoClass;
import com.flag.app.Flag;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Invoking main in the runner");
		
		Logo loger=new LogoClass();
		loger.Design(null, 0, 0, null, false);
		
		Logo loger1=new LogoClass();
		loger1.Design("Lion", 1000, 1000, "brownze", true);
		
		Logo loger2=new LogoClass();
		loger2.toString();
		
		System.out.println("=============================");
		
		Cave cave=new Cave(null, 0, 0, false, false, null, null, false, 0, null);
		System.out.println(cave);

		Cave cave1=new Cave("Stone", 17, 50, true, false, "Leafs", "Bandipur", false, 10, "Lion");
		System.out.println(cave1);

		Cave cave2=new Cave("Stone", 39, 40, true, true, "Meat", "Mandya", true, 9, "Tiger");
		System.out.println(cave2);
		
		System.out.println("=============================");
		
		Pendent pendent=new Pendent();
		System.out.println(pendent);

		Pendent pendent1=new Pendent( "Diamond",  "Maroon",  30,  99.900000,  true,  "Ganesh Jewellers", "Rhombus",  "Fish",  8,  5,  2,  true);
		System.out.println(pendent1);

		Pendent pendent2=new Pendent("Ruby",  "Green", 20,  89.9000,  true,  "Lalitha Jewelwers", "Circle",  "Dandelion",  7,  4,  2,  true);
		System.out.println(pendent2);
		
		System.out.println("=============================");
		
		Karchief karchief=new Karchief(null, null, 0, false, 0, 0, false);
		System.out.println(karchief);

		Karchief karchief1=new Karchief("Blue", "Woolen", 100, true, 10, 10, false);
		System.out.println(karchief1);

		Karchief karchief2=new Karchief("Brown", "Cotten", 200, true, 20, 7, true);
		System.out.println(karchief2);
		
		System.out.println("=============================");
		
		Flag flag = new Flag(90, 4, 60);
		System.out.println(flag);
		Flag flag1=new Flag(0, 0, 0); 
		System.out.println(flag1);
		Flag flag2=new Flag(3, 4, 2); 
		System.out.println(flag2);
	

	}

	

}
