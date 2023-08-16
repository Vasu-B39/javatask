package com.flag.app;

public class Flag {
	
	protected float length;
	protected int colors;
	protected float width;

	public Flag(float length, int colors, float width)
	{
	   super();
	   this.length=length;
	   this.colors=colors;
	   this.width=width;
	   
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Flag length"+length +"No.. of colors" +colors +"Flag width" +width;
	}
	

}
