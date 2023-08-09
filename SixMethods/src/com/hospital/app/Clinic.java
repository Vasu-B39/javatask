package com.hospital.app;

import com.hospital.app.Hospital;

public class Clinic extends Hospital{
	@Override
	public void doctor() {
		// TODO Auto-generated method stub
		System.out.println("Invoking in method with override");
	}
	@Override
	public void doctor(String name) {
		// TODO Auto-generated method stub
		System.out.println("Invoking in method with override");
	}
	@Override
	public void doctor(String name, int old) {
		// TODO Auto-generated method stub
		System.out.println("Invoking in method with override");
	}
	@Override
	public void doctor(String name, int old, long invest) {
		// TODO Auto-generated method stub
		System.out.println("Invoking in method with override");
	}
	@Override
	public void doctor(String name, int old, long invest, String special) {
		// TODO Auto-generated method stub
		System.out.println("Invoking in method with override");
	}
	@Override
	public void doctor(String name, int old, long invest, String special, long salary) {
		// TODO Auto-generated method stub
		System.out.println("Invoking in method with override");
	}
	@Override
	public void doctor(String name, int old, long invest, String special, long salary, boolean dental) {
		// TODO Auto-generated method stub
		System.out.println("Invoking in method with override");
	}
	
	
	

}
