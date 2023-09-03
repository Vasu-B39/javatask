package com.association.app;

public class Politician implements Candiats {
	
	String[] candiates=new String[TOTAL_WIN];
	int stand; 

	@Override
	public void mla(String candiates) {
		this.candiates[stand]=candiates;
		
		if(this.stand<TOTAL_WIN)
		{
			System.out.println("valid index");
		}
		else
			{
				System.out.println("In-valid index");
			}
		this.stand++;
		System.out.println("candiate name "+candiates +" candiats position " +stand);
		
	}

	

}
