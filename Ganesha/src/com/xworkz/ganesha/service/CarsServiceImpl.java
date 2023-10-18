
package com.xworkz.ganesha.service;

import com.xworkz.ganesha.Cars;
import com.xworkz.ganesha.repositary.CarsRepositary;

public class CarsServiceImpl implements CarsService {
	
	private CarsRepositary carsRepositary;
	
	public CarsServiceImpl(CarsRepositary carsRepositary)
	{
		this.carsRepositary=carsRepositary;
	}

	@Override
	public boolean validAndSave(Cars name) {
		if(name!=null)
		{
			System.out.println(name);
			String brand=name.getBrand();
			String model=name.getModel();
		    long price=name.getPrice();
			String type=name.getType();
			int ratings=name.getRatings();
			boolean emi=name.isEmi();
			boolean freeService=name.isFreeService();
			int noOfseats=name.getNoOfseats();
			String features=name.getFeatures();
			boolean autoGareSystem=name.isAutoGareSystem();
			
			if(brand!=null && brand.isEmpty() )
			{
				System.out.println("Is valid"+name.getBrand());
			}
			else
			{
				System.out.println("Is In-Valid");
				return false;
			}
			
			if(model!=null && model.isEmpty() )
			{
				System.out.println("Is valid"+name.getModel());
			}
			else
			{
				System.out.println("Is In-Valid");
				return false;
			}
			
			if(type!=null && type.isEmpty() )
			{
				System.out.println("Is valid"+name.getType());
			}
			else
			{
				System.out.println("Is In-Valid");
				return false;
			}
			
			if(price!=0 && price>0 && price>10000000l )
			{
				System.out.println("Is valid"+name.getPrice());
			}
			else
			{
				System.out.println("Is In-Valid");
				return false;
			}
			
			if(ratings!=0 && ratings>0 && ratings<5)
			{
				System.out.println("Is valid"+name.getRatings());
			}
			else
			{
				System.out.println("Is In-Valid");
				return false;
			}
			
			if(noOfseats!=0 && noOfseats>2 )
			{
				System.out.println("Is valid"+name.getNoOfseats());
			}
			else
			{
				System.out.println("Is In-Valid");
				return false;
			}
			
			if(emi)
			{
				System.out.println("Is valid"+name.isEmi());
			}
			else
			{
				System.out.println("Is In-Valid");
				return false;
			}
			
			if(autoGareSystem)
			{
				System.out.println("Is valid"+name.isAutoGareSystem());
			}
			else
			{
				System.out.println("Is In-Valid");
				return false;
			}
			
			carsRepositary.isExists(name);
			System.out.println("Name is null");
			
			if(carsRepositary.isExists(name)==false)
			{
				System.out.println("Saved");
				this.carsRepositary.save(name);
			}
			else
			{
				System.out.println("it can't store");
				return false;
			}
		}
		this.carsRepositary.save(name);
		return false;
	}
	@Override
	public Cars findByName(String name) {
		if(name!=null && !name.isEmpty())
		{
			System.out.println("the name is found");
			carsRepositary.findByName(name);
		}
		else
		{
			System.out.println("thank you");
		}
		return null;
	}


	@Override
	public Cars findByBrandFeaturesModelType(String brand, String features, String model, String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cars findPriceRatingsNoOfSeats(long price, int ratings, int noOfSeats) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cars findEmiFreeserviceAutogaresystem(boolean emi, boolean freeService, boolean autoGareSystem) {
		// TODO Auto-generated method stub
		return null;
	}

}
