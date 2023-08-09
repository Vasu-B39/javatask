package com.hostel.app;

public class Hostel {
	
	public String name;
	public int old;
	public long invest;
	public String special;
	public long salary;
	public boolean gov;
	
	public void warden() {
		System.out.println("Invoking in method overload warden");
	}
	
	public void warden(String name) {
		
		System.out.println("Invoking in method overload warden");
		this.name=name;
	}
	
	public void warden(String name, int old) {
		this.warden(name);
		System.out.println("Invoking in methodoverload  warden");
		this.old=old;
	}
	
	public void warden(String name, int old, long invest) {
		this.warden(name, old);
		System.out.println("Invoking in method overload warden");
		this.invest=invest;
	}
	
	public void warden(String name, int old, long invest, String special) {
		this.warden(name, old, invest);
		System.out.println("Invoking in method overload warden");
		this.special=special;
	}
	
	public void warden(String name, int old, long invest, String special, long salary) {
		this.warden(name, old, invest, special);
		System.out.println("Invoking in method overload warden");
		this.salary=salary;
	}
	
	public void warden(String name, int old, long invest, String special, long salary, boolean gov) {
		this.warden(name, old, invest, special, salary);
		System.out.println("Invoking in method overload warden");
		this.gov=gov;
	}

}
