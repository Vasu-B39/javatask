package com.association.app;

public class Artist implements Painter {
	
	String[] art=new String[TOTAL_ART];
	int count;

	@Override
	public void sketchs(String art) {
         this.art[count]=art;
         this.count++;
		if(this.count>TOTAL_ART) {
			
		System.out.println("Great artist");
		}
		else 
		{
			System.out.println("artist");
		}
		
		System.out.println("art is "+ art+ "art no "+count);
	}
	
	
	

}
