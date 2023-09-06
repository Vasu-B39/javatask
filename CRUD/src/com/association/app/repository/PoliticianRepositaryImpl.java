package com.association.app.repository;

public class PoliticianRepositaryImpl implements PoliticianRepositary {
	
	String[] politics=new String[TOTAL_POLT];
	private int position;
	
	@Override
	public void store(String poltic) {
		
		if(this.position<TOTAL_POLT) {
			System.out.println("Stored in index");
			this.politics[position]=poltic;
		}
		else {
			System.out.println("stored full");
		}

	}

	

}
