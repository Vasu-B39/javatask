
package com.xworkz.dto.app.repositary;
import com.xworkz.dto.app.Weather;


public class WeatherRepositaryImpl implements WeatherRepositary {
	
	Weather[] dtos=new Weather[TOTAL_WEATHER];
	private int position;

	@Override
	public boolean save(Weather dto) {
		if(this.position<TOTAL_WEATHER)
		{
			System.out.println("weather Dto"+position);
			this.dtos[position]=dto;
			return true;
		}
		else
		{
			System.out.println("out of range");
			return false;
		}

	}

	

}
