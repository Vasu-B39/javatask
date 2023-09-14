package com.xworkz.application.app;

import java.io.Serializable;

public class DeveloperDTO implements Serializable{
	
	private String name;
	private int experience;
	private long salary;
	private String workingFor;
	private String designation;
	
	public DeveloperDTO(String name, int experience, long salary, String workingFor, String designation) {
		super();
		this.name=name;
		this.experience=experience;
		this.salary=salary;
		this.workingFor=workingFor;
		this.designation=designation;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getWorkingFor() {
		return workingFor;
	}

	public void setWorkingFor(String workingFor) {
		this.workingFor = workingFor;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	

}
