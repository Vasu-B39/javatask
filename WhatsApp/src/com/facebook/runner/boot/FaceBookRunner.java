package com.facebook.runner.boot;

import com.facebook.app.FaceBook;

public class FaceBookRunner {

	public static void main(String[] args) {

		FaceBook faceBook = new FaceBook();

		faceBook.setUsername("vasub39");
		faceBook.setFullName("vasu b ");
		faceBook.setFriendsCount(40);
		faceBook.setFollowersCount(10);
		faceBook.setPostsCount(5);
		faceBook.setPrivate(false);
		faceBook.setBio("v39");
		faceBook.setLocation("kengeri, Bangalore");
		faceBook.setEmail("vasu@facebook.com");
		faceBook.setPhoneNumber("9663251592");
		faceBook.setProfilePictureURL("http://example.com/profile.jpg");
		faceBook.setVerified(true);
		faceBook.setTimelineEnabled(true);
		faceBook.setTaggingAllowed(true);

		// Getting values using getter methods
		System.out.println("Username: " + faceBook.getUsername());
		System.out.println("Full Name: " + faceBook.getFullName());
		System.out.println("Friends Count: " + faceBook.getFriendsCount());
		System.out.println("Followers Count: " + faceBook.getFollowersCount());
		System.out.println("Posts Count: " + faceBook.getPostsCount());
		System.out.println("Is Private: " + faceBook.isPrivate());
		System.out.println("Bio: " + faceBook.getBio());
		System.out.println("Location: " + faceBook.getLocation());
		System.out.println("Email: " + faceBook.getEmail());
		System.out.println("Phone Number: " + faceBook.getPhoneNumber());
		System.out.println("Profile Picture URL: " + faceBook.getProfilePictureURL());
		System.out.println("Is Verified: " + faceBook.isVerified());
		System.out.println("Is Timeline Enabled: " + faceBook.isTimelineEnabled());
		System.out.println("Is Tagging Allowed: " + faceBook.isTaggingAllowed());
	}

}