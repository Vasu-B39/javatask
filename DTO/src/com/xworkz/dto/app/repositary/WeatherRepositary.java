package com.xworkz.dto.app.repositary;

import com.xworkz.dto.app.Weather;

public interface WeatherRepositary {
	
	int TOTAL_WEATHER=5;
	
	public boolean save(Weather dto);

}
