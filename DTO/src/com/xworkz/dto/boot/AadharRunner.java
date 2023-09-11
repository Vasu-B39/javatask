package com.xworkz.dto.boot;

import com.xworkz.dto.app.AadharDTO;
import com.xworkz.dto.app.repositary.AadharRepository;
import com.xworkz.dto.app.repositary.AadharRepositoryImpl;
import com.xworkz.dto.app.service.AadharService;
import com.xworkz.dto.app.service.AadharServiceImpl;

public class AadharRunner {

	public static void main(String[] args) {
		
		AadharRepository repos=new AadharRepositoryImpl();
		AadharService serve=new AadharServiceImpl(repos);
		
		AadharDTO aadhar=new AadharDTO(0, null, null);
		AadharDTO aadhar1=new AadharDTO(12345667767l , "Jaan", "Shivamogga");
		
		serve.validateAndSave(aadhar1);
		serve.validateAndSave(aadhar);
		

	}

}
