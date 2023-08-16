package com.xwork.abstaction.app;

import com.xwork.abstraction.app.Metro;

public  class PurplelineMetro extends Metro {
	
	@Override
	public void move()
	{
		System.out.println("invoking the move ");
	}
	
	@Override
	public  void stop()
	{
		System.out.println("invoking the stop ");
	}
	
	@Override
	public  void announcement()
	{
		System.out.println("invoking the announcement ");
	}

	@Override
	public  void start()
	{
		System.out.println("invoking the start ");
	}

	@Override
	public  void openDoors()
	{
		System.out.println("invoking the openDoors ");
	}

}
