package com.association.app.servici;

import com.association.app.repository.ArtistRepositaryImpl;

public abstract class ArtistServiceImpl implements ArtistService {
	
	public  ArtistRepositaryImpl artistService;
	
	public ArtistServiceImpl(ArtistRepositaryImpl artistService) {
		this.artistService=artistService;
	}


	@Override
	public boolean validationAndSaved(String name) {
		System.out.println("this.getClass(), this.ArtistService()");
		
		if(name !=null && !name.isEmpty() && name.length()>=3 && name.length()<=10)
		{
			System.out.println("name is valid ");
			this.artistService.store(name);
			return true;
		}
		else 
		{
			System.out.println("name is In-Valid");
		}
		
		return false;
	}

}
