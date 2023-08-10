package com.irctc.app;

public class Irctc {
	 
    private String passengerName;
    private String trainName;
    private String sourceStation;
    private String destinationStation;
    private String journeyDate;
    private String departureTime;
    private String arrivalTime;
    private int seatNumber;
    private String coachType;
    private String bookingStatus;
    private String ticketType;
    private boolean isSleeper;
    private boolean isAC;
    private boolean isTatkalBooking;

   
    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getSourceStation() {
        return sourceStation;
    }

    public void setSourceStation(String sourceStation) {
        this.sourceStation = sourceStation;
    }

    public String getDestinationStation() {
        return destinationStation;
    }

    public void setDestinationStation(String destinationStation) {
        this.destinationStation = destinationStation;
    }

    public String getJourneyDate() {
        return journeyDate;
    }

    public void setJourneyDate(String journeyDate) {
        this.journeyDate = journeyDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getCoachType() {
        return coachType;
    }

    public void setCoachType(String coachType) {
        this.coachType = coachType;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public boolean isSleeper() {
        return isSleeper;
    }

    public void setSleeper(boolean isSleeper) {
        this.isSleeper = isSleeper;
    }

    public boolean isAC() {
        return isAC;
    }

    public void setAC(boolean isAC) {
        this.isAC = isAC;
    }

    public boolean isTatkalBooking() {
        return isTatkalBooking;
    }

    public void setTatkalBooking(boolean isTatkalBooking) {
        this.isTatkalBooking = isTatkalBooking;
    }

    
}