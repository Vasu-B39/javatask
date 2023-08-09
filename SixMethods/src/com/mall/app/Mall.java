package com.mall.app;

public class Mall {
	
	public String name;
	public int old;
	public long invest;
	public String special;
	public long salary;
	public boolean mul;
	
	public void max() {
		System.out.println("Invoking in method overload warden");
	}
	
	public void max(String name) {
		
		System.out.println("Invoking in method overload warden");
		this.name=name;
	}
	
	public void max(String name, int old) {
		this.max(name);
		System.out.println("Invoking in methodoverload  warden");
		this.old=old;
	}
	
	public void max(String name, int old, long invest) {
		this.max(name, old);
		System.out.println("Invoking in method overload warden");
		this.invest=invest;
	}
	
	public void max(String name, int old, long invest, String special) {
		this.max(name, old, invest);
		System.out.println("Invoking in method overload warden");
		this.special=special;
	}
	
	public void max(String name, int old, long invest, String special, long salary) {
		this.max(name, old, invest, special);
		System.out.println("Invoking in method overload warden");
		this.salary=salary;
	}
	
	public void max(String name, int old, long invest, String special, long salary, boolean mul) {
		this.max(name, old, invest, special, salary);
		System.out.println("Invoking in method overload warden");
		this.mul=mul;
	}


}
