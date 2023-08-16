/**
 * 
 */
package com.tostring.app;
import com.tostring.app.Logo;

/**
 * @author Vasu B
 *
 */
public class LogoClass extends Logo {
	
	
	@Override
	public void Design(String name, long year, int old, String colors, boolean publicity) {
		// TODO Auto-generated method stub
		super.Design(name, year, old, colors, publicity);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println(name);
		System.out.println(old);
		System.out.println(colors);
		System.out.println(year);
		System.out.println(publicity);
		return super.toString();
	}

}
