package com.netflix.runner.boot;

import com.netflix.app.NetFlix;

public class NetFlixRunner {

	public static void main(String[] args) {

		NetFlix netFlix = new NetFlix();

		netFlix.setAccountName("archana_nk");
		netFlix.setSubscriptionPlan("Standard");
		netFlix.setPremium(true);
		netFlix.setFamilyPlan(false);
		netFlix.setNumberOfDevices(2);
		netFlix.setOfflinePlaybackSupported(true);
		netFlix.setNumberOfProfiles(3);
		netFlix.setProfileNames("archana33");
		netFlix.setKidProfileEnabled(true);
		netFlix.setPaymentMethod("Credit Card");
		netFlix.setBillingAddress("123 Main Street");
		netFlix.setAutoRenewalEnabled(true);
		netFlix.setRenewalDate("2023-09-01");
		netFlix.setEmailNotificationEnabled(true);

		System.out.println("Account Name: " + netFlix.getAccountName());
		System.out.println("Subscription Plan: " + netFlix.getSubscriptionPlan());
		System.out.println("Is Premium: " + netFlix.isPremium());
		System.out.println("Is Family Plan: " + netFlix.isFamilyPlan());
		System.out.println("Number of Devices: " + netFlix.getNumberOfDevices());
		System.out.println("Is Offline Playback Supported: " + netFlix.isOfflinePlaybackSupported());
		System.out.println("Number of Profiles: " + netFlix.getNumberOfProfiles());
		System.out.println("Profile Names: " + netFlix.getProfileNames());
		System.out.println("Is Kid Profile Enabled: " + netFlix.isKidProfileEnabled());
		System.out.println("Payment Method: " + netFlix.getPaymentMethod());
		System.out.println("Billing Address: " + netFlix.getBillingAddress());
		System.out.println("Is Auto Renewal Enabled: " + netFlix.isAutoRenewalEnabled());
		System.out.println("Renewal Date: " + netFlix.getRenewalDate());
		System.out.println("Is Email Notification Enabled: " + netFlix.isEmailNotificationEnabled());
	}

}