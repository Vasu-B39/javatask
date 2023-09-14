package com.xworkz.application.app.service;

import com.xworkz.application.app.DeveloperDTO;

public interface DeveloperService {
	
	public boolean validAndSave(DeveloperDTO dto);
	
     public DeveloperDTO findByName(String name);
	
     public DeveloperDTO findByWorkingFor(String name);
	
     public DeveloperDTO findByDesignation(String name);
	
     public DeveloperDTO findByNameAndDesignation(String name, String workingFor);
	
     public DeveloperDTO findByNameAndSalaryAndDesignation(String name, long salary, String designation);

	

}
