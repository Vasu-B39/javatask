package com.association.app.servive;

import com.association.app.reporetary.MedicineResporetary;

public class MedicineServiceImpl implements MedicineService {
	
	public MedicineResporetary medicineResporetary;
	
	public MedicineServiceImpl(MedicineResporetary medicineResporetary)
	{
		this.medicineResporetary=medicineResporetary;
	}
	

	
	public boolean validationAndSave(String name) {
		
		if(name !=null && !name.isEmpty() && name.length()>=3 && name.length()<=10)
			
		{
			System.out.println("Data stored in index");
			this.medicineResporetary.store(name);
			return true;
		}
		else
		{
			System.out.println("Data is In_Valid");
		}
		
		return false;
	}

}
