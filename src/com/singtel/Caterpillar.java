package com.singtel;

public class Caterpillar implements Transformable,Crawlable {

	@Override
	public void crawl() {
		System.out.println("I'm crawling");
		
	}

	@Override
	public Pupa transform() {
		return new Pupa();		
	}
	
}
