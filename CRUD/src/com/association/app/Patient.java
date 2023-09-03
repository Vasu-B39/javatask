package com.association.app;

public class Patient implements Hospital{
	
	String[] doctors=new String[TOTAL_BEDS];
	int count;

	@Override
	public void wards(String doctors) {
		this.doctors[count]=doctors;
		
		if(TOTAL_BEDS<this.count)
		{
			System.out.println("valid index");
		}
		else
		{
			System.out.println("in-valid index");
		}
		this.count++;
		System.out.println("patient doctor is "+doctors + " token no "+ count);
		
		
	}

}
