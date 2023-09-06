package com.association.app.repository;

public class ArtistRepositaryImpl implements ArtistRepositary {
	
	
	String[] arts=new String[TOTAL_ARTW];
	private int position;
	
	
	public void store(String art) {
		
		if(this.position<TOTAL_ARTW)
		{
			System.out.println("art is stored");
			this.arts[position]=art;
		}
		else
		{
			System.out.println("is full");
		}
		this.position++;
	}

}
