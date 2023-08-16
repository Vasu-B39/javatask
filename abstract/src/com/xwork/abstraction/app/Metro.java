package com.xwork.abstraction.app;

public abstract class Metro {

	public abstract void move();

	public abstract void stop();

	public abstract void announcement();

	public abstract void start();

	public abstract void openDoors();

	public void accelerate() {
		System.out.println("Metro is accelerating.");
	}

	public void decelerate() {
		System.out.println("Metro is decelerating.");
	}

	public void emergencyBrake() {
		System.out.println("Emergency brake activated.");
	}

	public void playAnnouncement(String msg) {
		System.out.println("Announcement:"+msg);
	}

	public void completeJourney() {
		System.out.println("Metro has completed its journey.");
	}


}