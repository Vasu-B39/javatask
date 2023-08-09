package com.Library.app;

public class Library {
	public String name;
	public int old;
	public long invest;
	public String special;
	public long salary;
	public boolean mul;
	
	public void govt() {
		System.out.println("Invoking in method overload warden");
	}
	
	public void govt(String name) {
		
		System.out.println("Invoking in method overload warden");
		this.name=name;
	}
	
	public void govt(String name, int old) {
		this.govt(name);
		System.out.println("Invoking in methodoverload  warden");
		this.old=old;
	}
	
	public void govt(String name, int old, long invest) {
		this.govt(name, old);
		System.out.println("Invoking in method overload warden");
		this.invest=invest;
	}
	
	public void govt(String name, int old, long invest, String special) {
		this.govt(name, old, invest);
		System.out.println("Invoking in method overload warden");
		this.special=special;
	}
	
	public void govt(String name, int old, long invest, String special, long salary) {
		this.govt(name, old, invest, special);
		System.out.println("Invoking in method overload warden");
		this.salary=salary;
	}
	
	public void govt(String name, int old, long invest, String special, long salary, boolean mul) {
		this.govt(name, old, invest, special, salary);
		System.out.println("Invoking in method overload warden");
		this.mul=mul;
	}


}
