package com.hotel.app;

import com.hotel.app.Hotel;

public class Supply extends Hotel{
	@Override
	public void owner() {
		// TODO Auto-generated method stub
		System.out.println("Invoking in method override owner");
	}
	@Override
	public void owner(String name) {
		// TODO Auto-generated method stub
		System.out.println("Invoking in method override owner");
	}
	@Override
	public void owner(String name, int old, long invest) {
		// TODO Auto-generated method stub
		System.out.println("Invoking in method override owner");
	}
	@Override
	public void owner(String name, int old, long invest, String item) {
		// TODO Auto-generated method stub
		System.out.println("Invoking in method override owner");
	}
	@Override
	public void owner(String name, int old, long invest, String item, float price) {
		// TODO Auto-generated method stub
		super.owner(name, old, invest, item, price);
	}
	@Override
	public void owner(String name, int old, long invest, String item, float price, boolean chacolate) {
		// TODO Auto-generated method stub
		super.owner(name, old, invest, item, price, chacolate);
	}
}
