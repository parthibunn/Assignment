package com.singtel;

public class Solution {
	
	public static void main(String[] args) {
		
		int canFly=0, canWalk=0, canSing=0, canSwim=0;
		
		Animal[] animals = new Animal[]{ new Duck(), new Chicken(), new Rooster<>(new Chicken()), new Parrot<>(new Dog()), 
				new Dog(), new Caterpillar(), new Pupa(), new Adult(), new Cat()
				};
		
		for(int i=0; i<animals.length; i++) {
			if(animals[i] instanceof Flyable) {
				canFly+=1;
			}
			if(animals[i] instanceof Walkable) {
				canWalk+=1;
			}
			if(animals[i] instanceof Singable) {
				canSing+=1;
			}
			if(animals[i] instanceof Swimmable) {
				canSwim+=1;
			}
		}
		
		System.out.println(canFly + " animals can Fly\n" + canWalk + " animals can Walk\n" + canSing + " animals can Sing\n" + canSwim + " animals can Swim");
	}

}
