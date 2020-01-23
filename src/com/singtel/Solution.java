package com.singtel;

public class Solution {
	
	public static void main(String[] args) {
		Duck duck = new Duck();
		duck.sing();
		System.out.println(duck instanceof Swimmable?"Duck can swim":"Duck cannot swim");
		Chicken chicken = new Chicken();
		chicken.sing();
		System.out.println(chicken instanceof Flyable?"Chicken can fly":"Chicken cannot fly");
	}

}
