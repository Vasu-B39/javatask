package com.redbus.runner.boot;

import com.redbus.app.RedBus;

public class RedBusRunner {
	
	
    public static void main(String[] args) {
        
        RedBus redBus = new RedBus();

       
        redBus.setPassengerName("Sahana");
        redBus.setSourceCity("Karwar");
        redBus.setDestinationCity("Goa");
        redBus.setJourneyDate("2023-08-20");
        redBus.setDepartureTime("08:00 AM");
        redBus.setArrivalTime("02:00 PM");
        redBus.setBusOperator("VRS Travels");
        redBus.setBusType("Semi-Sleeper");
        redBus.setSeatNumber(12);
        redBus.setTicketNumber("RB123456");
        redBus.setFareAmount(500.0);
        redBus.setSleeper(false);
        redBus.setAC(true);

     
        System.out.println("Passenger Name: " + redBus.getPassengerName());
        System.out.println("Source City: " + redBus.getSourceCity());
        System.out.println("Destination City: " + redBus.getDestinationCity());
        System.out.println("Journey Date: " + redBus.getJourneyDate());
        System.out.println("Departure Time: " + redBus.getDepartureTime());
        System.out.println("Arrival Time: " + redBus.getArrivalTime());
        System.out.println("Bus Operator: " + redBus.getBusOperator());
        System.out.println("Bus Type: " + redBus.getBusType());
        System.out.println("Seat Number: " + redBus.getSeatNumber());
        System.out.println("Ticket Number: " + redBus.getTicketNumber());
        System.out.println("Fare Amount: $" + redBus.getFareAmount());
        System.out.println("Sleeper Bus: " + redBus.isSleeper());
        System.out.println("AC Bus: " + redBus.isAC());
    }
}