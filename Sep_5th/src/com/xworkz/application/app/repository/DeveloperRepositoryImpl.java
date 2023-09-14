package com.xworkz.application.app.repository;

import com.xworkz.application.app.DeveloperDTO;

public class DeveloperRepositoryImpl implements DeveloperRepository {
	
	DeveloperDTO[] developers=new DeveloperDTO[10];
	private int position;
	

	public void save(DeveloperDTO dto) {
		
		if(this.position<=10) 
		{
			System.out.println("Valid for index");
			this.developers[position]=dto;
		}
		else
		{
			System.out.println("out of Storage");
		}

	}


	@Override
	public DeveloperDTO findByName(String name) {
		for(int index=0; index<this.position; index++)
		{
			DeveloperDTO temp=developers[index];
			if(temp.getName().equalsIgnoreCase(name))
			{
				System.out.println("It's found");
				return temp;
			}
		}
		
		return null;
	}

	@Override
	public DeveloperDTO findByWorkingFor(String name) {
		
		for(int index=0; index<position; index++)
		{
			DeveloperDTO temp=developers[index];
			if(temp.getWorkingFor().equals(name))
			{
				System.out.println("the workingFor its found");
				return temp;
			}
			else
			{
				System.out.println("It's not found");
			}
		}
		
		return null;
	}

	@Override
	public DeveloperDTO findByDesignation(String name) {
		for(int index=0; index<position; index++)
		{
			DeveloperDTO temp=developers[index];
			if(temp.getDesignation().equals(name))
			{
				System.out.println("the designation it's found");
				return temp;
			}
			else
			{
				System.out.println("designation it's not found");
			}
		}
		
		return null;
	}

	@Override
	public DeveloperDTO findByNameAndDesignation(String name, String workingFor) {
		for(int index=0; index<position; index++)
		{
			DeveloperDTO temp=developers[index];
			if(temp.getDesignation().equals(workingFor) && temp.getName().equals(name))
			{
				System.out.println("the Name and Designation its found");
				return temp;
			}
			else
			{
				System.out.println("not found");
			}
		}
		return null;
	}
		
	@Override
	
	public DeveloperDTO findByNameAndSalaryAndDesignation(String name, long salary, String designation) {
		for(int index=0; index<position; index++)
		{
			DeveloperDTO temp=developers[index];
			if(temp.getName().equals(name) && temp.getDesignation().equals(designation) && temp.getSalary()!=0)
			{
				System.out.println("its found");
				return temp;
			}
			else
			{
				System.out.println("its not found ");
			}
		}
		return null;
	}


	@Override
	public boolean isExists(DeveloperDTO dto) {
		for(int index=0; index<position; index++)
		{
			DeveloperDTO temp=developers[index];
			if(temp!=null && temp.equals(dto))
			{
				System.out.println("sry is already exists, try another one");
				return true;
			}
			else
			{
				System.out.println("it is not exists");
			}
		}
		return false;
	}

}
