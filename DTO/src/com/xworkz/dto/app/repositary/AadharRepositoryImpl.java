package com.xworkz.dto.app.repositary;

import com.xworkz.dto.app.AadharDTO;

public class AadharRepositoryImpl implements AadharRepository {
	
	AadharDTO[] dtos=new AadharDTO[TOTAL_NUMBERS];
	private int position;

	@Override
	public void saveAadharInfo(AadharDTO aadharDTO) {
		if (this.position < TOTAL_NUMBERS) {
			this.dtos[position] = aadharDTO;
			System.out.println(aadharDTO + " is at index " + position);
			this.position++;
		} else {
			System.err.println("Out of range");
		}

	}

}
