package com.singtel;

public class Duck implements Bird,Flyable, Swimmable {

	@Override
	public void sing() {
		System.out.println("Quack, quack");
	}
	
	public void swim() {
		System.out.println("I'm swimming");
	}

	@Override
	public void walk() {
		System.out.println("I'm walking");
		
	}

	@Override
	public void fly() {
		System.out.println("I'm flying");
		
	}
}
