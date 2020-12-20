package com.dpattern.structural.proxy;

/**
 * One of the advantages of Proxy pattern is security.
 *
 * Proxy pattern is used when we need to create a wrapper to cover the main object's complexity
 * from the client.
 *
 * @author Srinath.Rayabarapu
 */
public class ProxyPatternMain {
	
	public static void main(String[] args) {
		InternetProxy proxy = new InternetProxy();
		proxy.connectTo("virus.com");
		proxy.connectTo("google.com");
	}

}