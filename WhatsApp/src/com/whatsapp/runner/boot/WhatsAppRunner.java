package com.whatsapp.runner.boot;

import com.whatsapp.app.WhatsApp;


public class WhatsAppRunner {
	public static void main(String[] args) {
		
		
		WhatsApp whatsApp=new WhatsApp();
		whatsApp.setChineseApp(false);
		whatsApp.setFounder("Jan Koum");
		whatsApp.setHeadQuarters("US");
		whatsApp.setIconColor("Green");
		whatsApp.setMostUsingCountry("India");
		whatsApp.setNoOfUsers(48700000);
		whatsApp.setOperatingSystem("Windows");
		whatsApp.setOrganization("India");
		whatsApp.setOwner("Facebook");
		whatsApp.setSecured(true);
		whatsApp.setSince(2009);
		whatsApp.setSize(141);
		whatsApp.setVersion(2.23f);
		whatsApp.setWrittenIn("English");
		
		
		System.out.println(whatsApp.getFounder());
		System.out.println(whatsApp.getHeadQuarters());
		System.out.println(whatsApp.getIconColor());
		System.out.println(whatsApp.getMostUsingCountry());
		System.out.println(whatsApp.getNoOfUsers());
		System.out.println(whatsApp.getOperatingSystem());
		System.out.println(whatsApp.getOrganization());
		System.out.println(whatsApp.getOwner());
		System.out.println(whatsApp.getSince());
		System.out.println(whatsApp.getSize());
		System.out.println(whatsApp.getVersion());
		System.out.println(whatsApp.getWrittenIn());
		System.out.println(whatsApp.isChineseApp());
		System.out.println(whatsApp.isSecured());
		
	}

}
