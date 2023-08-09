package com.bakery.app;

import com.bakery.app.Bakery;
import com.hospital.app.Hospital;
import com.bakery.app.Baker;

import com.hotel.app.Hotel;
import com.hotel.app.Supply;

import com.hospital.app.Hospital;
import com.hospital.app.Clinic;

import com.hostel.app.Hostel;
import com.hostel.app.BoysHostel;

import com.mall.app.Mall;
import com.mall.app.Shoping;

import com.theater.app.Theater;
import com.theater.app.Talkies;

import com.Library.app.Library;
import com.Library.app.BookStore;

import com.Library.app.Temple;
import com.Library.app.Iskon;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Bakery bakery=new Bakery();
		 bakery.bake("Iyengar");
		 bakery.bake("Iyengar", 50);
		 bakery.bake("Iyengar", 50, 100000);
		 bakery.bake("Iyengar", 50, 100000, "Bread");
		 bakery.bake("Iyengar", 50, 100000, "Bread", 30.5f);
		 bakery.bake("Iyengar", 50, 100000, "Bread", 30.5f, true);
		 Bakery bakery1=new Baker();
		 bakery1.bake();
		 
		 System.out.println("---------------------------");
		 
		 Hotel hotel=new Hotel();
		 hotel.owner("Udupi");
		 hotel.owner("Udupi", 50, 0);
		 hotel.owner("Udupi", 50, 100000);
		 hotel.owner("Udupi", 50, 100000, "Bread");
		 hotel.owner("Udupi", 50, 100000, "Bread", 30.5f);
		 Hotel hotel1=new Supply();
		 hotel1.owner();
		 
		 System.out.println("---------------------------");
		 
		 Hospital hospital=new Hospital();
		 hospital.doctor();
		 Hospital hospital1=new Clinic();
		 hospital1.doctor();
		 hospital1.doctor("Metro");
		 hospital1.doctor("Metro", 10);
		 hospital1.doctor("Metro", 10, 100000);
		 hospital1.doctor("Metro", 10, 100000, "Skin");
		 hospital1.doctor("Metro", 10, 100000, "Skin", 200000);
		 hospital1.doctor("Metro", 10, 100000, "Skin", 200000, true);
		 
		 System.out.println("---------------------------");
		 
		 Hostel hostel=new Hostel();
		 hostel.warden();
		 Hostel hostel1=new BoysHostel();
		 hospital1.doctor();
		 hostel1.warden("Metro");
		 hostel1.warden("Metro", 10);
		 hostel1.warden("Metro", 10, 100000);
		 hostel1.warden("Metro", 10, 100000, "Skin");
		 hostel1.warden("Metro", 10, 100000, "Skin", 200000);
		 hostel1.warden("Metro", 10, 100000, "Skin", 200000, true);
		 
		 System.out.println("---------------------------");
		 
		 Mall mall=new Mall();
		 mall.max();
		 Mall mall1=new Shoping();
		 mall1.max();
		 mall1.max("city center");
		 mall1.max("city center", 10);
		 mall1.max("city center", 20, 100000);
		 mall1.max("city center", 20, 100000, "Skin");
		 mall1.max("city center", 20, 100000, "Skin", 200000);
		 mall1.max("city center", 20, 100000, "Skin", 200000, false);
		 
		 System.out.println("---------------------------");
		 
		 Theater theater=new Theater();
		 theater.aptha("Udupi");
		 theater.aptha("Udupi", 50, 0);
		 theater.aptha("Udupi", 50, 100000);
		 theater.aptha("Udupi", 50, 100000, "Bread");
		 theater.aptha("Udupi", 50, 100000, "Bread", 300000);
		 theater.aptha("Udupi", 50, 100000, "Bread", 300000, false);
		 Theater theater1=new Talkies();
		 theater1.aptha();
		 
		 System.out.println("---------------------------");
		 
		 Library library=new Library();
		 library.govt("Udupi");
		 library.govt("Udupi", 50, 0);
		 library.govt("Udupi", 50, 100000);
		 library.govt("Udupi", 50, 100000, "Bread");
		 library.govt("Udupi", 50, 100000, "Bread", 300000);
		 library.govt("Udupi", 50, 100000, "Bread", 300000, false);
		 Library library1=new BookStore();
		 library1.govt();
		 
		 System.out.println("---------------------------");
		 
		 Temple temple=new Temple();
		 temple.krishna("banglore");
		 temple.krishna("banglore", 50, 0);
		 temple.krishna("banglore", 50, 100000);
		 temple.krishna("banglore", 50, 100000, "Bread");
		 temple.krishna("banglore", 50, 100000, "Bread", 300000);
		 temple.krishna("banglore", 50, 100000, "Bread", 300000, false);
		 Temple temple1=new Iskon();
		 temple1.krishna();
		 
		 System.out.println("---------------------------");

	}

}
