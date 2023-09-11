package com.xworkz.dto.app.repositary;

import com.xworkz.dto.app.NewsPaper;

public class NewsPaperRepositaryImpl implements NewsPaperRepositary {
	
	private NewsPaper[] dtos=new NewsPaper[TOTAL_ITEMS];
	private int position;

	public boolean save(NewsPaper dto) {
		
		if(this.position<TOTAL_ITEMS)
		{
			System.out.println("Dto is Valid");
			this.dtos[position]=dto;
			this.position++;
			return true;
		}
		else
		{
			System.out.println("Dto is In-valid");
		}
		return false;
 
	}

}
