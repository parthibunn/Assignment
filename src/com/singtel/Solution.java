package com.singtel;

public class Solution {
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		Parrot<Singable> parrotDog = new Parrot<Singable>(dog);
		parrotDog.sing();
		Cat cat = new Cat();
		Parrot<Singable> parrotCat = new Parrot<Singable>(cat);
		parrotCat.sing();
		Chicken chick = new Chicken();
		Rooster<Chicken> rooster = new Rooster<Chicken>(chick);
		Parrot<Singable> parrotRooster = new Parrot<Singable>(rooster);
		parrotRooster.sing();
		Duck duck = new Duck();
		Parrot<Singable> parrotDuck = new Parrot<Singable>(duck);
		parrotDuck.sing();
	}

}
