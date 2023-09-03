package com.association.app;

public class Medicine implements Clinic{
	
	String[] medicine1=new String[TOTAL_TAB];
	int no1;
	
	@Override
	public void medical(String medicine1) {
		this.medicine1[no1]=medicine1;
		
		if(this.no1 > TOTAL_TAB)
		{
			System.out.println("valid index");
		}
		else
		{
			System.out.println("In-valid index");
		}
		this.no1++;
		System.out.println("medicine name "+ medicine1 +" postion is "+no1);
	}
}
