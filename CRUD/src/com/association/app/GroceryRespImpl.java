package com.association.app;

public class GroceryRespImpl implements GroceryResp{
	
	String[] grocery=new String[TOTAL_ITEMS];
	int position;

	@Override
	public void save(String grocery) {
		this.grocery[position]=grocery;
		
		if(this.position<TOTAL_ITEMS)
		{
			System.out.println("Index is valid");
		}
		else
		{
			System.out.println("index is in-valid");
		}
		System.out.println("Items "+grocery +"position in "+this.position);
		this.position++;
	}

	

}
