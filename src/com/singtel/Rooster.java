package com.singtel;

public class Rooster<T extends Chicken> implements Singable {
	T chick;
	
	Rooster(T obj){
		this.chick = obj;
	}
	
	public void sing() {
		System.out.println("Cock-a-doodle-doo");
	}
	
	void walk() {
		chick.walk();
	}
}
