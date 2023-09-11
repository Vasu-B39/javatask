package com.xworkz.dto.app.repositary;

import com.xworkz.dto.app.AadharDTO;

public interface AadharRepository {

	int TOTAL_NUMBERS=5;

	void saveAadharInfo(AadharDTO aadharDTO);
}
