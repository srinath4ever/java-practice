package com.dpattern.creational.factory.abstrct;

/**
 * super class can be an interface also
 */
public abstract class Computer{

	public abstract String getRAM();
	public abstract String getHDD();
	public abstract String getCPU();

	@Override
	public String toString() {
		return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
	}

}
