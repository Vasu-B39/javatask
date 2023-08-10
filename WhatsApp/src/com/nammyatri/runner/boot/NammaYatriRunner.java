package com.nammyatri.runner.boot;

import com.nammayatri.app.NammaYatri;

public class NammaYatriRunner {

	public static void main(String[] args) {

		NammaYatri nammaYatri = new NammaYatri();

		nammaYatri.setTravelerName("vasu b");
		nammaYatri.setDriverName("dhanu");
		nammaYatri.setSourceLocation("Bangalore");
		nammaYatri.setDestinationLocation("Mumbai");
		nammaYatri.setTravelDate("2023-08-15");
		nammaYatri.setDepartureTime("08:00 AM");
		nammaYatri.setArrivalTime("09:00 AM");
		nammaYatri.setVehicleModel("swift");
		nammaYatri.setLicensePlate("v39");
		nammaYatri.setTravelDistance(20.0);
		nammaYatri.setTravelFare(25.0);
		nammaYatri.setLuxuryVehicle(true);
		nammaYatri.setSharedRide(true);
		nammaYatri.setTravelerRated(true);

		System.out.println("Traveler Name: " + nammaYatri.getTravelerName());
		System.out.println("Driver Name: " + nammaYatri.getDriverName());
		System.out.println("Source Location: " + nammaYatri.getSourceLocation());
		System.out.println("Destination Location: " + nammaYatri.getDestinationLocation());
		System.out.println("Travel Date: " + nammaYatri.getTravelDate());
		System.out.println("Departure Time: " + nammaYatri.getDepartureTime());
		System.out.println("Arrival Time: " + nammaYatri.getArrivalTime());
		System.out.println("Vehicle Model: " + nammaYatri.getVehicleModel());
		System.out.println("License Plate: " + nammaYatri.getLicensePlate());
		System.out.println("Travel Distance: " + nammaYatri.getTravelDistance());
		System.out.println("Travel Fare: " + nammaYatri.getTravelFare());
		System.out.println("Is Luxury Vehicle: " + nammaYatri.isLuxuryVehicle());
		System.out.println("Is Shared Ride: " + nammaYatri.isSharedRide());
		System.out.println("Is Traveler Rated: " + nammaYatri.isTravelerRated());
	}

}