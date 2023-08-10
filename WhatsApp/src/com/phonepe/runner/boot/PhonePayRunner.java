package com.phonepe.runner.boot;

import com.phonepe.app.PhonePay;

public class PhonePayRunner {
	
	
    public static void main(String[] args) {
        
        PhonePay phonePay = new PhonePay();

        // Setting values using setter methods
        phonePay.setPhoneNumber("1234567890");
        phonePay.setEmail("archana@phonePay.com");
        phonePay.setFullName("Archana Naik");
        phonePay.setAccountBalance(5000.0);
        phonePay.setUPIEnabled(true);
        phonePay.setLinkedBank("State Bank");
        phonePay.setKYCVerified(true);
        phonePay.setAddress("123 Main Street");
        phonePay.setCity("Karwar");
        phonePay.setState("Karnataka");
        phonePay.setPinCode("12345");
        phonePay.setNotificationsEnabled(true);
        phonePay.setAutoRechargeEnabled(true);
        phonePay.setSecureLoginEnabled(true);

        // Getting values using getter methods
        System.out.println("Phone Number: " + phonePay.getPhoneNumber());
        System.out.println("Email: " + phonePay.getEmail());
        System.out.println("Full Name: " + phonePay.getFullName());
        System.out.println("Account Balance: $" + phonePay.getAccountBalance());
        System.out.println("UPI Enabled: " + phonePay.isUPIEnabled());
        System.out.println("Linked Bank: " + phonePay.getLinkedBank());
        System.out.println("KYC Verified: " + phonePay.isKYCVerified());
        System.out.println("Address: " + phonePay.getAddress());
        System.out.println("City: " + phonePay.getCity());
        System.out.println("State: " + phonePay.getState());
        System.out.println("Pin Code: " + phonePay.getPinCode());
        System.out.println("Notifications Enabled: " + phonePay.isNotificationsEnabled());
        System.out.println("Auto Recharge Enabled: " + phonePay.isAutoRechargeEnabled());
        System.out.println("Secure Login Enabled: " + phonePay.isSecureLoginEnabled());
    }
}