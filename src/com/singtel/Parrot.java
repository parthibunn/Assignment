package com.singtel;

public class Parrot <T extends Singable> implements Bird{
	
	T obj;
	
	Parrot(T singable){
		this.obj = singable;
	}

	@Override
	public void walk() {
		System.out.println("I'm walking");
		
	}

	@Override
	public void sing() {
		obj.sing();
		
	}

	
}
