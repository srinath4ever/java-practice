package com.dpattern.creational.builder;

public class VegBurger extends Burger{

	@Override
	public String name() {
		return "Veg Burger";
	}

	@Override
	public int price() {
		return 5;
	}
	
}
