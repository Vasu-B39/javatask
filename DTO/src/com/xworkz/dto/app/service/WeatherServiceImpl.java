package com.xworkz.dto.app.service;

import com.xworkz.dto.app.Weather;
import com.xworkz.dto.app.repositary.WeatherRepositary;

public class WeatherServiceImpl implements WeatherService {
	
	public WeatherRepositary weatherRepositary;
	
	public WeatherServiceImpl(WeatherRepositary weatherRepositary) {
		this.weatherRepositary=weatherRepositary;
	}

	@Override
	public boolean validAndSave(Weather dto) {
		System.out.println("Validation check"+this.getClass().getSimpleName());
		
		if(dto !=null)
		{
			System.out.println(dto);
			String cloud= dto.getCloud();
			 double temprature=dto.getTemprature();
			 float preasure=dto.getPreasure();
			 int winSpeed=dto.getWinSpeed();
			 
			 if(cloud !=null && cloud.length()>=3 && cloud.length()<=10)
			 {
				 System.out.println("weather is"+dto.getCloud()+" is valid" );
			 }
			 else
			 {
				 System.out.println("In-Valid");
				 return false;
			 }
			 
			 if(temprature>=0 && temprature<=99 )
			 {
				 System.out.println("weather temprature is "+dto.getTemprature()+" is valid");
			 }
			 else
			 {
				 System.out.println("is In-Valid");
				 return false;
			 }
			 
			 if(preasure>10 && preasure<=50)
			 {
				 System.out.println("weather preasure is "+dto.getPreasure()+" is valid");
			 }
			 else
			 {
				 System.out.println("is In-Valid");
				 return false;
			 }
			 
			 if(winSpeed>10 && winSpeed<=50)
			 {
				 System.out.println("weather winSpeed is "+dto.getWinSpeed()+" is valid");
			 }
			 else
			 {
				 System.out.println("is In-Valid");
				 return false;
			 }
			
			
		}
		else
		{
			System.out.println("weather is not null");
		}
		this.weatherRepositary.save(dto);
		return false;
	}

}
