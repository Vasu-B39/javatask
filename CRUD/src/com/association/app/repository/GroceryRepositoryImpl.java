package com.association.app.repository;

public class GroceryRepositoryImpl implements  GroceryRepository{
	
	String[] grocerys=new String[TOTAL_ITEM];
	private int positon;
	@Override
	public void store(String grocery) {
		System.out.println("this.getClass(), this.GroceryService()");
		this.grocerys[positon]=grocery;
		if(this.positon<TOTAL_ITEM)
		{
			System.out.println("Valid index stored");
		}
		else
		{
			System.out.println("stored full");
		}
	}
	
	

}
