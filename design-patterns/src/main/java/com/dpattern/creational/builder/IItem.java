package com.dpattern.creational.builder;

/**
 * Generalized Item interface which will be applied for all the items
 * 
 */
public interface IItem {
	
	public String name();
	public IPacking packing();
	public int price(); 
	
}
