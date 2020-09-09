package com.dpattern.structural.adapter;

/**
 * The adapter pattern convert the interface of a class into another interface clients expect. Adapter lets classes work
 * together that couldn’t otherwise because of incompatible interfaces.
 *
 * @author Srinath.Rayabarapu
 */
public class AdapterPatternMain {
	
	public static void main(String[] args) {
		
		Duck mallardDuck = new MallardDuck();
		Turkey wildTurkey = new WildTurkey();
		
		Duck turkeyToDuck = new TurkeytoDuckAdapter(wildTurkey);
		
		System.out.println("The Duck says..");
		callDuck(mallardDuck);
		
		System.out.println("\nThe Turkey says..");
		callTurkey(wildTurkey);

		System.out.println("\nThe TurkeyAdapter says..");
		callDuck(turkeyToDuck);
		
	}

	private static void callTurkey(Turkey wildTurkey) {
		wildTurkey.gobble();
		wildTurkey.fly();
	}

	private static void callDuck(Duck turkeyToDuck) {
		turkeyToDuck.quack();
		turkeyToDuck.fly();
	}
}