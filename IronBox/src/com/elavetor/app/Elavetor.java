package com.elavetor.app;

public class Elavetor {
	
	public String company;
	public double power;
	public double capacity;
	public int max;
	
	public void stairCase()
	{
		System.out.println("invoking in no-args");
		
		stairCase("RAR");
		stairCase("RAR", 230);
		stairCase("RAR", 230, 99);
		stairCase("RAR", 230, 99, 4);
	}
	
	public void stairCase(String company)
	{
		System.out.println("invoking in String-args");
		this.company=company;
	}
	
	public void stairCase(String company, double power)
	{
		System.out.println("invoking in String and int-args");
		this.power=power;
	}
	
	public void stairCase(String company, int power, float capacity)
	{
		System.out.println("invoking in String int and float-args");
		this.capacity=capacity;
	}
	
	public void stairCase(String company, int power, float capacity, int max)
	{
		System.out.println("invoking in String int and float-args");
		this.max=max;
				
		System.out.println("elavetor build company is "+company);
		System.out.println("elavetor run to available power is "+power);
		System.out.println("elavetor capacity is "+capacity);
		System.out.println("elavetor maximum persons range "+max);;
	}

}
