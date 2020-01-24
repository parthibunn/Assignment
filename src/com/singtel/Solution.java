package com.singtel;

public class Solution {
	
	public static void main(String[] args) {
		Chicken chicken = new Chicken();
		Rooster<Chicken> rooster = new Rooster<>(chicken);
		rooster.sing();
		rooster.walk();
	}

}
