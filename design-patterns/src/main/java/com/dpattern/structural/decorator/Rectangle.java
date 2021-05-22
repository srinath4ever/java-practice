package com.dpattern.structural.decorator;

public class Rectangle implements IShape {

	@Override
	public void draw() {
		System.out.println("Drawing a Rectangle!");
	}
}