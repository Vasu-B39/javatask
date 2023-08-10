package com.instagram.runner.boot;

import com.instagram.app.Instagram;

public class InstagramRunner {

	
	public static void main(String[] args) {
		
		Instagram instagram=new Instagram();
		instagram.setBio("O Positive");
		instagram.setBusinessAccount(true);
		instagram.setEmail("vasu@gmail.com");
		instagram.setFollowersCount(10);
		instagram.setFollowingCount(50);
		instagram.setFullName("vasu b");
		instagram.setNoOfBlocked(4);
		instagram.setPhoneNumber(966325152);
		instagram.setPostsCount(5);
		instagram.setPublic(true);
		instagram.setSponsored(true);
		instagram.setUsername("vasu b");
		instagram.setVerified(true);
		instagram.setWebsite("www.insta/archana_nk.com");
		
		System.out.println(instagram.getBio());
		System.out.println(instagram.getEmail());
		System.out.println(instagram.getFollowersCount());
		System.out.println(instagram.getFollowingCount());
		System.out.println(instagram.getFullName());
		System.out.println(instagram.getNoOfBlocked());
		System.out.println(instagram.getPhoneNumber());
		System.out.println(instagram.getPostsCount());
		System.out.println(instagram.getUsername());
		System.out.println(instagram.getWebsite());
		System.out.println(instagram.isBusinessAccount());
		System.out.println(instagram.isPublic());
		System.out.println(instagram.isSponsored());
		System.out.println(instagram.isVerified());
	}
		
	}