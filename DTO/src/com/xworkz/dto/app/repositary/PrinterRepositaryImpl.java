package com.xworkz.dto.app.repositary;

import com.xworkz.dto.app.PrinterDTO;

public class PrinterRepositaryImpl implements PrinterRepository {
	
	PrinterDTO[] dtos=new PrinterDTO[TOTAL_PRINT];
	private int position;

	@Override
	public boolean save(PrinterDTO printer) {
		if(this.position<TOTAL_PRINT) {
			System.out.println("is valid "+this.position);
			this.dtos[position]=printer;
			return true;
		}
		else
		{
			System.out.println("is In-Valid");
		}
		return false;
	}

}
