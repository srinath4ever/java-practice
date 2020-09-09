package com.dpattern.creational.builder;

public class MealBuilder {
	
	public Meal prepareVegBurger(){
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal prepareChickenBurger(){
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());		
		return meal;
	}

}