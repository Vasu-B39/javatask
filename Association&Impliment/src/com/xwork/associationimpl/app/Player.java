package com.xwork.associationimpl.app;

public class Player implements ValleyBall, FootBall, Hocky{
	
	public Cricket cricket;
	
	public static void batsMan() {
		System.out.println("Invoking  Player in batsman");
	}
	
	public void setBatsMan(Cricket cricket) {
		
		this.cricket=cricket;
    }
	
	@Override
	public void noOfPlayers() {
		System.out.println("Invoking  Player in noOfPlayers");
		
	}

	public void cricket(Cricket cricket1) {
		// TODO Auto-generated method stub
		
	}
	
	

}
