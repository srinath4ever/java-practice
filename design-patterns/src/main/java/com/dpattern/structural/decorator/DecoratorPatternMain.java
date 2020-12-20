package com.dpattern.structural.decorator;

/**
 * It's a Structural pattern - Decorator pattern allows a user to add new functionality to an existing object without
 * altering its structure (operates at Object level, not at class level). Acts as a wrapper to existing class.
 *
 * This pattern creates a decorator class which wraps the original class and provides additional functionality keeping
 * class methods signature intact.
 * 
 * <br>
 * Idea: Have a Ishape interface with draw method. Let circle and rectangle implement it. Create RedShapeDecorator class
 * which also implements and accepts IShape interface objects. This class has extra methods which will add extra functionality
 * to passed IShape objects
 *
 * @author Srinath.Rayabarapu
 */
public class DecoratorPatternMain {
	
	public static void main(String[] args) {
		
		IShape redCircle = new RedShapeDecorator(new Circle());
		IShape redRectangle = new RedShapeDecorator(new Rectangle());
		
		//draws circle and adds extra  functionality
		redCircle.draw();
		//draws circle and adds extra  functionality
		redRectangle.draw();
	}
}