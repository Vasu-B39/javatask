/**
 * 
 */
package com.tostring.app;

/**
 * @author Vasu B
 *
 */
public class Logo {
	
	protected String name;
	protected long year;
	protected int old;
	protected String colors;
	protected boolean publicity;
	
	
	public void Design(String name, long year, int old, String colors, boolean publicity)
	{
		System.out.println(" Invoking the Design");
		this.name=name;
		this.old=old;
		this.publicity=publicity;
		this.year=year;
		this.colors=colors;
	
	}

}
