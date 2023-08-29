package com.xwork.association.app;

public class Trainer {
	
	private String teach;
	private Laptop name;
	
	
	public Trainer(String teach) {
		this.teach=teach;
	}

	public void setName(Laptop name) {
		this.name=name;
		
	}
	
	public void train() {
		System.out.println("Invoking in train");
		this.name.learn();
	}

	
}
