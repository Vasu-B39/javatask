package com.bakery.app;

import com.bakery.app.Bakery;

public class Baker extends Bakery{
	@Override
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("Invoking in method with override");
	}
	
	@Override
	public void bake(String name) {
		// TODO Auto-generated method stub
		System.out.println("Invoking in method with override");
	}
	
	@Override
	public void bake(String name, int exp) {
		// TODO Auto-generated method stub
		System.out.println("Invoking in method with override");
	}
	
	@Override
	public void bake(String name, int exp, long invest) {
		// TODO Auto-generated method stub
		System.out.println("Invoking in method with override");
	}
	
    @Override
	public void bake(String name, int exp, long invest, String item) {
		// TODO Auto-generated method stub
    	System.out.println("Invoking in method with override");
	}
    
    @Override
    public void bake(String name, int exp, long invest, String item, float price) {
    	// TODO Auto-generated method stub
    	System.out.println("Invoking in method with override");
    }
    
    @Override
    public void bake(String name, int exp, long invest, String item, float price, boolean chacolate) {
    	// TODO Auto-generated method stub
    	System.out.println("Invoking in method with override");
    }
	
	

}
