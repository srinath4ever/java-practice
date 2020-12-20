package com.dpattern.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal{
	
	private List<IItem> iItems = new ArrayList<>();
	
	public void addItem(IItem iItem){
		this.iItems.add(iItem);
	}
	
	public int getCost(){
		int a = 0;
		for (IItem iItem : this.iItems) {
			a += iItem.price();
		}
		return a;
	}
	
	public void showItems(){
		for (IItem iItem : this.iItems) {
			System.out.println("Item Name :" + iItem.name());
			System.out.println("Item Price :" + iItem.price());
			System.out.println("Item Packing :" + iItem.packing().pack());
		}
	}
}
