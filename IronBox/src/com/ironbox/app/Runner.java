package com.ironbox.app;

import com.ironbox.app.IronBox;

import com.hotel.app.Hotel;

import com.stapler.app.Stapler;

import com.umbrela.app.Umbrella;

import com.gadget.app.Gadget;

import com.mouse.app.Mouse;

import com.elavetor.app.Elavetor;

public class Runner {
	
	public static void main(String[] args)
	{
		System.out.println("invoking main menu in runner");
		
		IronBox ironBox=new IronBox();
		ironBox.Box();
		
		System.out.println("===============================");
		Hotel hotel=new Hotel();
		hotel.food();
		
		System.out.println("===============================");
		Umbrella umbrella=new Umbrella();
		umbrella.chatri();
		
		System.out.println("===============================");
		Stapler stapler=new Stapler();
		stapler.pinHodiyodu();
		
		System.out.println("===============================");
		Gadget gadget=new Gadget();
		gadget.electronics();
		
		System.out.println("===============================");
		Mouse mouse=new Mouse();
		mouse.electronics();
		
		System.out.println("===============================");
		Elavetor elavetor=new Elavetor();
		elavetor.stairCase();
	}

}
