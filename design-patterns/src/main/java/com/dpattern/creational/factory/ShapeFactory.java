package com.dpattern.creational.factory;

public class ShapeFactory {

	public IShape getShape(String string) {
		if(string.equalsIgnoreCase("circle")) {
			return new CircleShape();
		}
		if(string.equalsIgnoreCase("triangle")) {
			return new TriangleShape();
		}
		if(string.equalsIgnoreCase("square")) {
			return new SquareShape();
		}
		return null;
	}

}