package com.linkedin.runner.boot;

import com.linkedin.app.LinkedIn;

public class LinkedinRunner {

	public static void main(String[] args) {
		
		 LinkedIn  linkedIn=new  LinkedIn();
		 linkedIn.setJobSeeker(true);
		 linkedIn.setPremiumMember(false);
		 linkedIn.isVisibilityLimited();
		 linkedIn.setCompany("Infosys");
		 linkedIn.setConnectionsCount(25);
		 linkedIn.setCurrentJob("wipro");
		 linkedIn.setEmail("vasub@gmail.com");
		 linkedIn.setFullName("vasu B");
		 linkedIn.setHeadline("vb");
		 linkedIn.setIndustry("L & T");
		 linkedIn.setLocation("Banglore");
		 linkedIn.setPhoneNumber(0);
		 linkedIn.setProfilePictureURL("vb");
		 linkedIn.setSummary("gajcgjuajvuhjhvjvj");
		 
		 System.out.println( linkedIn.isJobSeeker());
			System.out.println(linkedIn.isPremiumMember());
			System.out.println(linkedIn.isVisibilityLimited());
			System.out.println(linkedIn.getCompany());
			System.out.println(linkedIn.getConnectionsCount());
			System.out.println(linkedIn.getCurrentJob());
			System.out.println(linkedIn.getEmail());
			System.out.println(linkedIn.getFullName());
			System.out.println(linkedIn.getHeadline());
			System.out.println(linkedIn.getHeadline());
			System.out.println(linkedIn.getIndustry());
			System.out.println(linkedIn.getLocation());
			System.out.println(linkedIn.getPhoneNumber());
			System.out.println(linkedIn.getProfilePictureURL());
			System.out.println(linkedIn.getSummary());
		 
		 

	}

}
