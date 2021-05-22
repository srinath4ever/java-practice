package com.dpattern.structural.proxy;

public class RealInternet implements IInternet {

	@Override
	public void connectTo(String site) {
		System.out.println("Connecting to site.." + site);
	}

}
