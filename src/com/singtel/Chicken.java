package com.singtel;

public class Chicken implements Bird,Singable {

	@Override
	public void sing() {
		System.out.println("Cluck, cluck");
	}

	@Override
	public void walk() {
		System.out.println("I'm walking");		
	}
}
