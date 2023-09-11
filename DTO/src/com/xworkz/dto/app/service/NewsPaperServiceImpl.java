package com.xworkz.dto.app.service;

import com.xworkz.dto.app.NewsPaper;
import com.xworkz.dto.app.repositary.NewsPaperRepositary;

public class NewsPaperServiceImpl implements NewsPaperService {
	
	public NewsPaperRepositary newsPaperRepositary;
	
	public NewsPaperServiceImpl(NewsPaperRepositary newsPaperRepositary) {
		this.newsPaperRepositary=newsPaperRepositary;
	}

	@Override
	public boolean validAndSave(NewsPaper dto) {
		System.out.println("validation "+this.getClass().getSimpleName());
		if(dto!=null)
		{
			System.out.println(" Dto is equal to null");
			this.newsPaperRepositary.save(dto);
		}
		System.out.println(" Dto is equal to null");
		return false;
	}

}
