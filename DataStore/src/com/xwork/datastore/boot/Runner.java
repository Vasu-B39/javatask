package com.xwork.datastore.boot;

import com.xwork.datastore.app.GroceryRespImpl;

public class Runner {

	public static void main(String[] args) {
	
		GroceryRespImpl store=new GroceryRespImpl();
		store.save("badam");
		store.save("almod");
		store.save("pista");
		store.save("milk");
		store.save("dry grape");
		store.save("mango");
		store.save("orange");
		store.save("lemon");
		store.save("lemon");
		store.save("lemon");
	
		

	}

}
