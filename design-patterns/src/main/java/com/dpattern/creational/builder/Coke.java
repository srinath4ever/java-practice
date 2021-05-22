package com.dpattern.creational.builder;

public class Coke extends ColdDrink{

	@Override
	public String name() {
		return "Coke";
	}

	@Override
	public int price() {
		return 3;
	}

}
