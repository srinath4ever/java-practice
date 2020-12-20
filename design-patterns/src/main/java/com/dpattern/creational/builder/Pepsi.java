package com.dpattern.creational.builder;

public class Pepsi extends ColdDrink{

	@Override
	public String name() {
		return "Pepsi";
	}

	@Override
	public int price() {
		return 2;
	}

}
