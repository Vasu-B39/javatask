package com.xworkz.application.app.service;

import com.xworkz.application.app.DeveloperDTO;
import com.xworkz.application.app.repository.DeveloperRepository;

public class DeveloperServiceImpl implements DeveloperService {
	
	private DeveloperRepository developerRepository;
	
	
	public DeveloperServiceImpl(DeveloperRepository developerRepository) {
		this.developerRepository=developerRepository;
	}

	@Override
	public boolean validAndSave(DeveloperDTO dto) {
		if(dto!=null)
		{
			developerRepository.isExists(dto);
			System.out.println("dto is null,so can't it store");
			
			
			if(developerRepository.isExists(dto)==false)
			{
				System.out.println("It's start to store");
				developerRepository.save(dto);
			}
			else
			{
				System.out.println("sry, It's can't be stored");
			}
		}
		return false;
	}

	@Override
	public DeveloperDTO findByName(String name) {
		if(name!=null && !name.isEmpty())
		{
			DeveloperDTO dto=this.developerRepository.findByName(name);
			return dto;
		}
		else
		{
			System.out.println("thank you");
		}
		return null;
	}

	@Override
	public DeveloperDTO findByWorkingFor(String name) {
		if(name !=null && !name.isEmpty())
		{
			DeveloperDTO dto=this.developerRepository.findByWorkingFor(name);
			return dto;
		}
		else
		{
			System.out.println("thank you");
		}
		return null;
	}

	@Override
	public DeveloperDTO findByDesignation(String name) {
		if(name!=null && !name.isEmpty())
		{
			DeveloperDTO dto=this.developerRepository.findByDesignation(name);
			return dto;
		}
		else
		{
			System.out.println("thank you");
		}
		return null;
	}

	
	@Override
	public DeveloperDTO findByNameAndDesignation(String name, String workingFor) {
		if(name!=null && !name.isEmpty() && workingFor!=null && !workingFor.isEmpty())
		{
			DeveloperDTO dto=this.developerRepository.findByNameAndDesignation(name, workingFor);
			return dto;
		}
		else
		{
			System.out.println("thank you");
		}
		return null;
	}

	@Override
	public DeveloperDTO findByNameAndSalaryAndDesignation(String name, long salary, String designation) {
		if(name!=null && !name.isEmpty() && designation!=null && !designation.isEmpty() && salary!=0)
		{
			DeveloperDTO dto=this.developerRepository.findByNameAndSalaryAndDesignation(name, salary, designation);
			return dto;
		}
		else
		{
			System.out.println("thank you");
		}
		return null;
	}

}
