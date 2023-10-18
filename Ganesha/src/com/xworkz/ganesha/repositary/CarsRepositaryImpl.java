package com.xworkz.ganesha.repositary;

import com.xworkz.ganesha.Cars;

public class CarsRepositaryImpl implements CarsRepositary {
	
	Cars[] saves=new Cars[TOTAL_CARS];
	private int position;
	

	@Override
	public void save(Cars store) {
		if(this.position<TOTAL_CARS)
		{
			System.out.println(store +" is valid "+ position);
			this.saves[position]=store;
			this.position++;
		}
		else
		{
			System.out.println("Storage already full");
		}

	}


	@Override
	public boolean isExists(Cars store) {
		for(int i=0; i<position; i++)
		{
			Cars temp=saves[i];
			if(temp!=null && temp.equals(saves))
			{
				System.out.println("Its already exists");
				return true;
			}
			else
			{
				System.out.println("it saved Sucessfully");
			}
		}
		return false;
	}
	
	@Override
	public Cars findByName(String name) {
		System.out.println(this.getClass().getName());
		for(int index=0; index<this.position; index++)
		{
			Cars stores=saves[index];
			if(stores.getcarsName().equals(name))
			{
				System.out.println("It is found");
				return stores;
			}
			else
			{
				System.out.println("its not found");
			}
		return null;
	}
		return null;

}
}


