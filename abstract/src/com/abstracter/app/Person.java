package com.abstracter.app;

public abstract class Person {

	public abstract void introduce();
	public abstract void work();
	public abstract void study();
	public abstract void eat();
	public abstract void sleep();


	public void celebrateBirthday() {
     System.out.println("Happy birthday");
 }

	public void displayAge() {
     System.out.println("Dispaly the age");
 }

	public void relax() {
     System.out.println("He is relaxing.");
 }

	public void exercise() {
     System.out.println("He is exercising.");
 }

	public void greet() {
     System.out.println("I am developer");
 }
}