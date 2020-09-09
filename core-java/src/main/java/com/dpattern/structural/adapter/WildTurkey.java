package com.dpattern.structural.adapter;

public class WildTurkey implements Turkey{
	
	@Override
	public void fly() {
		System.out.println("Flying short distance..");
	}
	
	@Override
	public void gobble() {
		System.out.println("Gobble gobble..");
	}
	
}
