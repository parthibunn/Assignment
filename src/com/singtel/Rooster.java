package com.singtel;

public class Rooster<T extends Chicken> {
	T chick;
	
	Rooster(T obj){
		this.chick = obj;
	}
	
	void sing() {
		System.out.println("Cock-a-doodle-doo");
	}
	
	void walk() {
		chick.walk();
	}
}
