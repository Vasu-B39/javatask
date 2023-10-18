package com.xworkz.store;

public class Store {
	
	public void email(String[] emaills)
	{
		for(int size=0;size<=emaills.length-1;size++)
      {
		System.out.println("emaills at index "+size+ "is :"+emaills[size]);	
      }
	}
	
	public void groceryItem(String[] groceryItems)
	{
		for(int size=0;size<=groceryItems.length-1;size++)
      {
		System.out.println("groceryItems at index "+size+ "is :"+groceryItems[size]);	
      }
	}
	
	public void team(String[] teams)
	{
		for(int size=0;size<=teams.length-1;size++)
      {
		System.out.println("team at index "+size+ "is :"+teams[size]);	
      }
	}

}
