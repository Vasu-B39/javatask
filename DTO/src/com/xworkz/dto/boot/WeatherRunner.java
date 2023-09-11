package com.xworkz.dto.boot;

import com.xworkz.dto.app.Weather;
import com.xworkz.dto.app.repositary.WeatherRepositary;
import com.xworkz.dto.app.repositary.WeatherRepositaryImpl;
import com.xworkz.dto.app.service.WeatherService;
import com.xworkz.dto.app.service.WeatherServiceImpl;

public class WeatherRunner {

	public static void main(String[] args) {
		
		WeatherRepositary respo=new WeatherRepositaryImpl();
		WeatherService serve=new WeatherServiceImpl(respo);
		
		Weather weather=new Weather(null, 0, 0, 0);
		serve.validAndSave(weather);
		
		Weather weather1=new Weather("Rain", 20, 21.3f, 120);
		serve.validAndSave(weather1);

	}

}
