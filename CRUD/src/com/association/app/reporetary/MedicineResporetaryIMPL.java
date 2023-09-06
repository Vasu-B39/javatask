package com.association.app.reporetary;

public class MedicineResporetaryIMPL implements MedicineResporetary {
	
	String[] medicins=new String[TOTAL_TAB];
	private int position;

	@Override
	public void store(String medcine) {
		System.out.println("this.getClass(), , this.MedicineService()");
		this.medicins[position]=medcine;
		
		if(this.position<TOTAL_TAB)
		{
			System.out.println("stored index is valid");
		}
		else
		{
			System.out.println("Index is not valid to store");
		}
		this.position++;

	}

}
