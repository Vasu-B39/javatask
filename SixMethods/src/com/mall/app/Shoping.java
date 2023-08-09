package com.mall.app;

import com.mall.app.Mall;

public class Shoping extends Mall{
	@Override
	public void max() {
		// TODO Auto-generated method stub
		System.out.println("Invoking in method with override");
	}
	@Override
	public void max(String name) {
		// TODO Auto-generated method stub
		System.out.println("Invoking in method with override");
	}
	@Override
	public void max(String name, int old) {
		// TODO Auto-generated method stub
		System.out.println("Invoking in method with override");
	}
	@Override
	public void max(String name, int old, long invest) {
		// TODO Auto-generated method stub
		System.out.println("Invoking in method with override");
	}
	@Override
	public void max(String name, int old, long invest, String special) {
		// TODO Auto-generated method stub
		System.out.println("Invoking in method with override");
	}
	@Override
	public void max(String name, int old, long invest, String special, long salary) {
	 	// TODO Auto-generated method stub
		System.out.println("Invoking in method with override");
	}
    @Override
    public void max(String name, int old, long invest, String special, long salary, boolean mul) {
    	// TODO Auto-generated method stub
    	System.out.println("Invoking in method with override");
    }
	
}