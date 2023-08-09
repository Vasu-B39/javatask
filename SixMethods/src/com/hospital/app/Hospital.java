package com.hospital.app;

public class Hospital {
	
	public String name;
	public int old;
	public long invest;
	public String special;
	public long salary;
	public boolean dental;

	public void doctor() {
			System.out.println("Invoking in method overload owner");
		}
		
		public void doctor(String name) {
			
			System.out.println("Invoking in method overload owner");
			this.name=name;
		}
		
		public void doctor(String name, int old) {
			this.doctor(name);
			System.out.println("Invoking in methodoverload  owner");
			this.old=old;
		}
		
		public void doctor(String name, int old, long invest) {
			this.doctor(name, old);
			System.out.println("Invoking in method overload owner");
			this.invest=invest;
		}
		
		public void doctor(String name, int old, long invest, String special) {
			this.doctor(name, old, invest);
			System.out.println("Invoking in method overload owner");
			this.special=special;
		}
		
		public void doctor(String name, int old, long invest, String special, long salary) {
			this.doctor(name, old, invest, special);
			System.out.println("Invoking in method overload owner");
			this.salary=salary;
		}
		
		public void doctor(String name, int old, long invest, String special, long salary, boolean dental) {
			this.doctor(name, old, invest, special, salary);
			System.out.println("Invoking in method overload owner");
			this.dental=dental;
		}

}
