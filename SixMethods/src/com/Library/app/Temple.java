package com.Library.app;

public class Temple {
	public String name;
	public int old;
	public long invest;
	public String special;
	public long salary;
	public boolean mul;
	
	public void krishna() {
		System.out.println("Invoking in method overload warden");
	}
	
	public void krishna(String name) {
		
		System.out.println("Invoking in method overload warden");
		this.name=name;
	}
	
	public void krishna(String name, int old) {
		this.krishna(name);
		System.out.println("Invoking in methodoverload  warden");
		this.old=old;
	}
	
	public void krishna(String name, int old, long invest) {
		this.krishna(name, old);
		System.out.println("Invoking in method overload warden");
		this.invest=invest;
	}
	
	public void krishna(String name, int old, long invest, String special) {
		this.krishna(name, old, invest);
		System.out.println("Invoking in method overload warden");
		this.special=special;
	}
	
	public void krishna(String name, int old, long invest, String special, long salary) {
		this.krishna(name, old, invest, special);
		System.out.println("Invoking in method overload warden");
		this.salary=salary;
	}
	
	public void krishna(String name, int old, long invest, String special, long salary, boolean mul) {
		this.krishna(name, old, invest, special, salary);
		System.out.println("Invoking in method overload warden");
		this.mul=mul;
	}


}
