package com.redbus.app;

public class RedBus {
	 
    private String passengerName;
    private String sourceCity;
    private String destinationCity;
    private String journeyDate;
    private String departureTime;
    private String arrivalTime;
    private String busOperator;
    private String busType;
    private int seatNumber;
    private String ticketNumber;
    private double fareAmount;
    private boolean isSleeper;
    private boolean isAC;

    
    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getSourceCity() {
        return sourceCity;
    }

    public void setSourceCity(String sourceCity) {
        this.sourceCity = sourceCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
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

    public String getBusOperator() {
        return busOperator;
    }

    public void setBusOperator(String busOperator) {
        this.busOperator = busOperator;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public double getFareAmount() {
        return fareAmount;
    }

    public void setFareAmount(double fareAmount) {
        this.fareAmount = fareAmount;
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

   
}