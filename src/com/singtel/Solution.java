package com.singtel;

public class Solution {
	
	public String getStage(Butterfly butterfly) {
		if(butterfly instanceof Caterpillar) {
			return "Caterpillar";
		}
		if(butterfly instanceof Pupa) {
			return "Pupa";
		}
		if(butterfly instanceof Adult) {
			return "Adult";
		}
		return "";
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		Transformable caterpillar = new Caterpillar();
		System.out.println(sol.getStage(caterpillar));
		System.out.println(caterpillar instanceof Flyable?"Caterpillar can fly":"Caterpillar cannot fly");
		System.out.println(caterpillar instanceof Crawlable?"Caterpillar can crawl":"Caterpillar cannot crawl");
		Transformable pupa = (Transformable)caterpillar.transform();
		System.out.println(sol.getStage(pupa));
		System.out.println(pupa instanceof Breathable?"Pupa can breathe":"pupa cannot breathe");
		Butterfly adult = pupa.transform();
		System.out.println(sol.getStage(adult));
		System.out.println(adult instanceof Flyable?"Adult can fly":"Adult cannot fly");
		System.out.println(adult instanceof Singable?"Adult can sing":"Adult cannot sing");
	
	}

}
