package com.singtel;

public class Pupa implements Transformable, Breathable {

	@Override
	public void breathe() {
		System.out.println("I'm breathing");

	}

	@Override
	public Adult transform() {
		return new Adult();

	}

}
