package com.xworkz.application.boot;

import com.xworkz.application.app.DeveloperDTO;
import com.xworkz.application.app.repository.DeveloperRepository;
import com.xworkz.application.app.repository.DeveloperRepositoryImpl;
import com.xworkz.application.app.service.DeveloperService;
import com.xworkz.application.app.service.DeveloperServiceImpl;

public class DeveloperRunner {

	public static void main(String[] args) {
		
		DeveloperRepository repos=new DeveloperRepositoryImpl();
		
		DeveloperService serve=new DeveloperServiceImpl(repos);
		
		DeveloperDTO dto1=new DeveloperDTO("Jaan", 2, 20000, "Web developer", "front end");
		DeveloperDTO dto2=new DeveloperDTO(null, 0, 0, null, null);
		
		serve.validAndSave(dto1);
		serve.validAndSave(dto2);
		
		serve.findByName("Jaan");
		serve.findByDesignation("front end");
		serve.findByWorkingFor("Web developer");
		serve.findByNameAndDesignation("Jaan", "front end");
		serve.findByNameAndSalaryAndDesignation("Jaan", 20000, "front end");
		
		

	}

}
