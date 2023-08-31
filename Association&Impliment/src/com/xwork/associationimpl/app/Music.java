package com.xwork.associationimpl.app;




public class Music implements Singer, Flute, Guitor {
	
	public Song song;
	
	public void setSong(Song song) {
		System.out.println("Invoking in the music");
		this.song=song;
	}

	@Override
	public void rapper() {
		System.out.println("Invoking in the music");
		
	}
	@Override
	public void deep() {
		System.out.println("Invoking in the music");
		
	}
	
	@Override
	public void rythem() {
		System.out.println("Invoking in the music");
		
	}

}
