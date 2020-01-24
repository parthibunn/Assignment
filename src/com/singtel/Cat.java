package com.singtel;

public class Cat implements Animal, Singable {

	@Override
	public void walk() {
		System.out.println("I'm walking");
		
	}

	@Override
	public void sing() {
		System.out.println("Meow");
		
	}

}
