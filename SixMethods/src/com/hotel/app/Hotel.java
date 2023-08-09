package com.hotel.app;

public class Hotel {
	
	public String name;
	public int old;
	public long invest;
	public String item;
	public float price;
	public boolean dosa;

	public void owner() {
			System.out.println("Invoking in method overload owner");
		}
		
		public void owner(String name) {
			
			System.out.println("Invoking in method overload owner");
			this.name=name;
		}
		
		public void bake(String name, int old) {
			this.owner(name);
			System.out.println("Invoking in methodoverload  owner");
			this.old=old;
		}
		
		public void owner(String name, int old, long invest) {
			this.bake(name, old);
			System.out.println("Invoking in method overload owner");
			this.invest=invest;
		}
		
		public void owner(String name, int old, long invest, String item) {
			this.owner(name, old, invest);
			System.out.println("Invoking in method overload owner");
			this.item=item;
		}
		
		public void owner(String name, int old, long invest, String item, float price) {
			this.owner(name, old, invest, item);
			System.out.println("Invoking in method overload owner");
			this.price=price;
		}
		
		public void owner(String name, int old, long invest, String item, float price, boolean chacolate) {
			this.owner(name, old, invest, item, price);
			System.out.println("Invoking in method overload owner");
			this.dosa=dosa;
		}

}
