package com.snapchat.runner.boot;

import com.snapchat.app.Snapchat;

public class SnapChatRunner {

	public static void main(String[] args) {

		Snapchat user = new Snapchat();

		user.setUsername("archana454");
		user.setSnapScore(5000);
		user.setStreakCount(30);
		user.setPremium(true);
		user.setVerified(true);
		user.setEmail("archana@snap.com");
		user.setPhoneNumber("9876679098");
		user.setBitmojiAvatarURL("https://example.com/bitmoji.jpg");
		user.setGhostMode(false);
		user.setLocation("Karwar");
		user.setSnapMapVisible(true);
		user.setNotificationsOn(true);
		user.setFiltersEnabled(true);
		user.setLensesEnabled(true);

		System.out.println("Username: " + user.getUsername());
		System.out.println("Snap Score: " + user.getSnapScore());
		System.out.println("Streak Count: " + user.getStreakCount());
		System.out.println("Premium User: " + user.isPremium());
		System.out.println("Verified User: " + user.isVerified());
		System.out.println("Email: " + user.getEmail());
		System.out.println("Phone Number: " + user.getPhoneNumber());
		System.out.println("Bitmoji Avatar URL: " + user.getBitmojiAvatarURL());
		System.out.println("Ghost Mode: " + user.isGhostMode());
		System.out.println("Location: " + user.getLocation());
		System.out.println("Snap Map Visible: " + user.isSnapMapVisible());
		System.out.println("Notifications On: " + user.isNotificationsOn());
		System.out.println("Filters Enabled: " + user.isFiltersEnabled());
		System.out.println("Lenses Enabled: " + user.isLensesEnabled());
	}

}