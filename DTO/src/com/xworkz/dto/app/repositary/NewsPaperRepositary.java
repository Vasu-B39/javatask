package com.xworkz.dto.app.repositary;

import com.xworkz.dto.app.NewsPaper;

public interface NewsPaperRepositary {
	int TOTAL_ITEMS=10;
	
	public boolean save(NewsPaper dto);

}
