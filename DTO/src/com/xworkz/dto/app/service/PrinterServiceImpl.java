package com.xworkz.dto.app.service;

import com.xworkz.dto.app.PrinterDTO;
import com.xworkz.dto.app.repositary.PrinterRepository;

public class PrinterServiceImpl implements PrinterService {
	
	public PrinterRepository printerRepository;
	
	public PrinterServiceImpl(PrinterRepository printerRepository) {
		this.printerRepository=printerRepository;
	}

	@Override
	public boolean validAndSave(PrinterDTO printer) {
		System.out.println("valid check "+this.getClass().getSimpleName());
		If(printer !=null)
		{
			
			 boolean option=printer.isOption();
			String size=printer.getSize();
			
		}
		else
		{
			System.out.println("is In-Valid");
		}
		return false;
	}

}
