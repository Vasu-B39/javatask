package com.xworkz.dto.app.repositary;

import com.xworkz.dto.app.PrinterDTO;

public interface PrinterRepository {
	
	int TOTAL_PRINT=5;
	public boolean save(PrinterDTO printer);

}
