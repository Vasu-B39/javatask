package com.uber.runner.boot;

import com.uber.app.Uber;

public class UberRunner {

	public static void main(String[] args) {

		Uber uber = new Uber();

		uber.setPassengerName("Saividya");
		uber.setDriverName("Akshay");
		uber.setSourceLocation("Dandeli");
		uber.setDestinationLocation("Bangalore");
		uber.setRideDate("2023-08-10");
		uber.setPickupTime("08:00 AM");
		uber.setDropOffTime("09:00 AM");
		uber.setCarModel("Toyota Camry");
		uber.setLicensePlate("XYZ123");
		uber.setRideDistance(15.5);
		uber.setRideFare(20.75);
		uber.setUberX(true);
		uber.setRideShared(false);
		uber.setDriverRated(true);

		System.out.println("Passenger Name: " + uber.getPassengerName());
		System.out.println("Driver Name: " + uber.getDriverName());
		System.out.println("Source Location: " + uber.getSourceLocation());
		System.out.println("Destination Location: " + uber.getDestinationLocation());
		System.out.println("Ride Date: " + uber.getRideDate());
		System.out.println("Pickup Time: " + uber.getPickupTime());
		System.out.println("Drop-off Time: " + uber.getDropOffTime());
		System.out.println("Car Model: " + uber.getCarModel());
		System.out.println("License Plate: " + uber.getLicensePlate());
		System.out.println("Ride Distance: " + uber.getRideDistance());
		System.out.println("Ride Fare: " + uber.getRideFare());
		System.out.println("UberX: " + uber.isUberX());
		System.out.println("Ride Shared: " + uber.isRideShared());
		System.out.println("Driver Rated: " + uber.isDriverRated());
	}

}