package com.rapido.runner.boot;

import com.rapido.app.Rapido;


public class RapidoRunner {
	
	

    public static void main(String[] args) {
        
        Rapido rapido = new Rapido();

        rapido.setRiderName("vasu b");
        rapido.setCaptainName("chandan");
        rapido.setSourceLocation("kengeri");
        rapido.setDestinationLocation("vijayanagar");
        rapido.setRideDate("2023-08-15");
        rapido.setStartTime("09:00 AM");
        rapido.setEndTime("09:30 AM");
        rapido.setBikeModel("Pulsar 200");
        rapido.setLicensePlate("KA0eh5757");
        rapido.setRideDistance(10.5);
        rapido.setRideFare(150.0);
        rapido.setPrimeRide(true);
        rapido.setSharedRide(true);
        rapido.setRiderRated(true);

       
        System.out.println("Rider Name: " + rapido.getRiderName());
        System.out.println("Captain Name: " + rapido.getCaptainName());
        System.out.println("Source Location: " + rapido.getSourceLocation());
        System.out.println("Destination Location: " + rapido.getDestinationLocation());
        System.out.println("Ride Date: " + rapido.getRideDate());
        System.out.println("Start Time: " + rapido.getStartTime());
        System.out.println("End Time: " + rapido.getEndTime());
        System.out.println("Bike Model: " + rapido.getBikeModel());
        System.out.println("License Plate: " + rapido.getLicensePlate());
        System.out.println("Ride Distance: " + rapido.getRideDistance() + " km");
        System.out.println("Ride Fare: $" + rapido.getRideFare());
        System.out.println("Prime Ride: " + rapido.isPrimeRide());
        System.out.println("Shared Ride: " + rapido.isSharedRide());
        System.out.println("Rider Rated: " + rapido.isRiderRated());
    }
}