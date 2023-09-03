package com.association.app;

public class HistoricalPlaces implements Tourists{
	
	String[] visit=new String[TOTAL_VISITORS];
	
	int no;

	@Override
	public void places(String visit) {
		this.visit[no]=visit;
		
		if(this.no<TOTAL_VISITORS)
		{
			System.out.println("valid index");
		}
		else
		{
			System.out.println("In-valid index");
		}
		this.no++;
		System.out.println("Histprical places are "+ visit +" no of visting place is  "+no);
		
	}
}
