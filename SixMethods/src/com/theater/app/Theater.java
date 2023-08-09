package com.theater.app;

public class Theater {
	
	public String name;
	public int old;
	public long invest;
	public String special;
	public long salary;
	public boolean mul;
	
	public void aptha() {
		System.out.println("Invoking in method overload warden");
	}
	
	public void aptha(String name) {
		
		System.out.println("Invoking in method overload warden");
		this.name=name;
	}
	
	public void aptha(String name, int old) {
		this.aptha(name);
		System.out.println("Invoking in methodoverload  warden");
		this.old=old;
	}
	
	public void aptha(String name, int old, long invest) {
		this.aptha(name, old);
		System.out.println("Invoking in method overload warden");
		this.invest=invest;
	}
	
	public void aptha(String name, int old, long invest, String special) {
		this.aptha(name, old, invest);
		System.out.println("Invoking in method overload warden");
		this.special=special;
	}
	
	public void aptha(String name, int old, long invest, String special, long salary) {
		this.aptha(name, old, invest, special);
		System.out.println("Invoking in method overload warden");
		this.salary=salary;
	}
	
	public void aptha(String name, int old, long invest, String special, long salary, boolean mul) {
		this.aptha(name, old, invest, special, salary);
		System.out.println("Invoking in method overload warden");
		this.mul=mul;
	}


}
