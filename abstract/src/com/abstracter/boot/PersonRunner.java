package com.abstracter.boot;

import com.abstracter.app.Person;
import com.abstracter.app.Student;

public abstract class PersonRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Person person=new Student();
				person.celebrateBirthday();
				person.displayAge();
				person.eat();
				person.exercise();
				person.greet();
				person.introduce();
				person.relax();
				person.sleep();
				person.study();
				person.work();

	}

}
