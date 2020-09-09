package com.dpattern.creational.builder;

public abstract class ColdDrink implements IItem{
	
	@Override
	public IPacking packing() {
		return new Bottle();
	}
}
