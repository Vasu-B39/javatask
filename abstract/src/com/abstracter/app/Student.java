package com.abstracter.app;

public class Student extends Person{

	@Override
	public void introduce() {
		System.out.println("Introducing..");

	}

	@Override
	public void work() {
		System.out.println("Working....");

	}

	@Override
	public void study() {
		System.out.println("Studyimg...");

	}

	@Override
	public void eat() {
		System.out.println("Eating....");

	}

	@Override
	public void sleep() {
		System.out.println("Sleeping....");

	}

}