package com.singtel;

public class Bird extends Animal implements Flyable, Singable {
	public void fly() {
		System.out.println("I'm flying");
	}

	public void sing() {
		System.out.println("I'm singing");
	}
}
