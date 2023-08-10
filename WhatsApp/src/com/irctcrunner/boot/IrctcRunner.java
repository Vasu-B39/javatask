package com.irctcrunner.boot;

import com.irctc.app.Irctc;

public class IrctcRunner {
	
    public static void main(String[] args) {
        
        Irctc ticket = new Irctc();

        
        ticket.setPassengerName("Vasu b");
        ticket.setTrainName("Sdeepa travels");
        ticket.setSourceStation("kollapur");
        ticket.setDestinationStation("shivamogga");
        ticket.setJourneyDate("2023-08-15");
        ticket.setDepartureTime("08:00 AM");
        ticket.setArrivalTime("10:30 AM");
        ticket.setSeatNumber(12);
        ticket.setCoachType("sleeper");
        ticket.setBookingStatus("Confirmed");
        ticket.setTicketType("E-Ticket");
        ticket.setSleeper(true);
        ticket.setAC(true);
        ticket.setTatkalBooking(true);

       
        System.out.println("Passenger Name: " + ticket.getPassengerName());
        System.out.println("Train Name: " + ticket.getTrainName());
        System.out.println("Source Station: " + ticket.getSourceStation());
        System.out.println("Destination Station: " + ticket.getDestinationStation());
        System.out.println("Journey Date: " + ticket.getJourneyDate());
        System.out.println("Departure Time: " + ticket.getDepartureTime());
        System.out.println("Arrival Time: " + ticket.getArrivalTime());
        System.out.println("Seat Number: " + ticket.getSeatNumber());
        System.out.println("Coach Type: " + ticket.getCoachType());
        System.out.println("Booking Status: " + ticket.getBookingStatus());
        System.out.println("Ticket Type: " + ticket.getTicketType());
        System.out.println("Is Sleeper: " + ticket.isSleeper());
        System.out.println("Is AC: " + ticket.isAC());
        System.out.println("Is Tatkal Booking: " + ticket.isTatkalBooking());
    }
}