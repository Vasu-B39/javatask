package com.ola.runner.boot;

import com.ola.app.Ola;

public class OlaRunner {
	
	
    public static void main(String[] args) {
        
        Ola olaRide = new Ola();

        
        olaRide.setPassengerName("Akash");
        olaRide.setDriverName("Adarsh");
        olaRide.setSourceLocation("Home");
        olaRide.setDestinationLocation("Office");
        olaRide.setRideDate("2023-08-10");
        olaRide.setPickupTime("08:00 AM");
        olaRide.setDropOffTime("09:00 AM");
        olaRide.setCarModel("Sedan");
        olaRide.setLicensePlate("ABC123");
        olaRide.setRideDistance(15.0);
        olaRide.setRideFare(250.0);
        olaRide.setPrimeCar(true);
        olaRide.setRideShared(false);
        olaRide.setDriverRated(false);

        
        System.out.println("Passenger Name: " + olaRide.getPassengerName());
        System.out.println("Driver Name: " + olaRide.getDriverName());
        System.out.println("Source Location: " + olaRide.getSourceLocation());
        System.out.println("Destination Location: " + olaRide.getDestinationLocation());
        System.out.println("Ride Date: " + olaRide.getRideDate());
        System.out.println("Pickup Time: " + olaRide.getPickupTime());
        System.out.println("Drop-off Time: " + olaRide.getDropOffTime());
        System.out.println("Car Model: " + olaRide.getCarModel());
        System.out.println("License Plate: " + olaRide.getLicensePlate());
        System.out.println("Ride Distance: " + olaRide.getRideDistance() + " km");
        System.out.println("Ride Fare: $" + olaRide.getRideFare());
        System.out.println("Is Prime Car: " + olaRide.isPrimeCar());
        System.out.println("Is Ride Shared: " + olaRide.isRideShared());
        System.out.println("Is Driver Rated: " + olaRide.isDriverRated());
    }
}