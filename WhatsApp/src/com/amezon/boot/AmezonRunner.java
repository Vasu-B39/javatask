package com.amezon.boot;

import com.amezon.app.Amezon;

public class AmezonRunner {

	public static void main(String[] args) {
		
		Amezon amezon=new Amezon();
		amezon.setAvlBrands("Standerd");
		amezon.setFeatures("More Features");
		amezon.setFounder("Jeff Bezos");
		amezon.setIcon("A to Z");
		amezon.setIconBuilde("Duckwerth");
		amezon.setInstallers(20212332);
		amezon.setLanguage("english");
		amezon.setPay(true);
		amezon.setPopulor("more");
		amezon.setRatings(4.5f);
		amezon.setVersion(7.0f);
		amezon.setWorkers(12000);
		
		System.out.println(amezon.getAvlBrands());
		System.out.println(amezon.getFeatures());
		System.out.println(amezon.getFounder());
		System.out.println(amezon.getIcon());
		System.out.println(amezon.getIconBuilde());
		System.out.println(amezon.getInstallers());
		System.out.println(amezon.getLanguage());
		System.out.println(amezon.getPay());
		System.out.println(amezon.getPopulor());
		System.out.println(amezon.getRatings());
		System.out.println(amezon.getVersion());
		System.out.println(amezon.getWorkers());
		

	}

}
