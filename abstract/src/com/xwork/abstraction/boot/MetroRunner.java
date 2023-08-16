package com.xwork.abstraction.boot;

import com.xwork.abstaction.app.PurplelineMetro;

import com.xwork.abstraction.app.Metro;

public class MetroRunner {

	public static void main(String[] args) {

		System.out.println("Running MetroRunner...");

		Metro metro=new  PurplelineMetro();
		metro.accelerate();
		metro.announcement();
		metro.completeJourney();
		metro.decelerate();
		metro.emergencyBrake();
		metro.move();
		metro.openDoors();
		metro.start();
		metro.stop();
		metro.playAnnouncement("Pause");

	}

}