package com.xwork.association.app;

public class Passenger {

	private String name;
	private Bus num;

	public Passenger(String name) {
		this.name=name;
	}

	public void setNo(Bus num)
	{
		this.num=num;
	}

	public void ticket()
	{
		System.out.println("invoking ticket in Passenger...");
		this.num.travel();
	}
}