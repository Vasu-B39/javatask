package com.xworkz.application.app.repository;

import com.xworkz.application.app.DeveloperDTO;

public interface DeveloperRepository {
	
	public void save(DeveloperDTO dto);
	
	public DeveloperDTO findByName(String name);
	
	public DeveloperDTO findByWorkingFor(String name);
	
	public DeveloperDTO findByDesignation(String name);
	
	public DeveloperDTO findByNameAndDesignation(String name, String workingFor);
	
	public DeveloperDTO findByNameAndSalaryAndDesignation(String name, long salary, String designation);
	
	public boolean isExists(DeveloperDTO dto);

}
