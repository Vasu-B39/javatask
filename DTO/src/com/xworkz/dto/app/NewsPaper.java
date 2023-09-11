package com.xworkz.dto.app;

import java.io.Serializable;

public class NewsPaper implements Serializable{
	
	private String publisher;
	private int page;
	private String lang;
	private double cost;
	
	

	@Override
	public String toString() {
		return "NewsPaper [publisher=" + publisher + ", page=" + page + ", lang=" + lang + ", cost=" + cost + "]";
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	
	

}
