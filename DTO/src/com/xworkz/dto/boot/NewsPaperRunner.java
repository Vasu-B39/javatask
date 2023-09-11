package com.xworkz.dto.boot;

import com.xworkz.dto.app.NewsPaper;
import com.xworkz.dto.app.repositary.NewsPaperRepositary;
import com.xworkz.dto.app.repositary.NewsPaperRepositaryImpl;
import com.xworkz.dto.app.service.NewsPaperService;
import com.xworkz.dto.app.service.NewsPaperServiceImpl;

public class NewsPaperRunner {

	public static void main(String[] args) {
		
		NewsPaper news3=new NewsPaper();
		NewsPaperRepositary news2=new NewsPaperRepositaryImpl();
		NewsPaperService news1=new NewsPaperServiceImpl(news2);
		news1.validAndSave(null);
		
		

	}

}
