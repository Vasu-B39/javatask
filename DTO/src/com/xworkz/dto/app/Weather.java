package com.xworkz.dto.app;

import java.io.Serializable;

public class Weather implements Serializable{
	

	private static final long serialVersionUID = -350418407773125762L;
	private String cloud;
	private double temprature;
	private float preasure;
	private int winSpeed;
	
	public Weather(String cloud, double temprature, float preasure, int winSpeed) {
		super();
		this.cloud=cloud;
		this.preasure=preasure;
		this.temprature=temprature;
		this.winSpeed=winSpeed;
	}
	
	@Override
	public String toString() {
		return "Weather [cloud=" + cloud + ", temprature=" + temprature + ", preasure=" + preasure + ", winSpeed="
				+ winSpeed + "]";
	}
	public String getCloud() {
		return cloud;
	}
	public void setCloud(String cloud) {
		this.cloud = cloud;
	}
	public double getTemprature() {
		return temprature;
	}
	public void setTemprature(double temprature) {
		this.temprature = temprature;
	}
	public float getPreasure() {
		return preasure;
	}
	public void setPreasure(float preasure) {
		this.preasure = preasure;
	}
	public int getWinSpeed() {
		return winSpeed;
	}
	public void setWinSpeed(int winSpeed) {
		this.winSpeed = winSpeed;
	}
	
	

}
