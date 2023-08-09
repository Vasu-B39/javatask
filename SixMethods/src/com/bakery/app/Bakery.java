package com.bakery.app;

public class Bakery {
	
	public String name;
	public int exp;
	public long invest;
	public String item;
	public float price;
	public boolean chacolate;
	
	
	public void bake() {
		System.out.println("Invoking in method overload bake");
	}
	
	public void bake(String name) {
		
		System.out.println("Invoking in method overload bake");
		this.name=name;
	}
	
	public void bake(String name, int exp) {
		this.bake(name);
		System.out.println("Invoking in methodoverload  bake");
		this.exp=exp;
	}
	
	public void bake(String name, int exp, long invest) {
		this.bake(name, exp);
		System.out.println("Invoking in method overload bake");
		this.invest=invest;
	}
	
	public void bake(String name, int exp, long invest, String item) {
		this.bake(name, exp, invest);
		System.out.println("Invoking in method overload bake");
		this.item=item;
	}
	
	public void bake(String name, int exp, long invest, String item, float price) {
		this.bake(name, exp, invest, item);
		System.out.println("Invoking in method overload bake");
		this.price=price;
	}
	
	public void bake(String name, int exp, long invest, String item, float price, boolean chacolate) {
		this.bake(name, exp, invest, item, price);
		System.out.println("Invoking in method overload bake");
		this.chacolate=chacolate;
	}
	
	
	

}
