package com.dpattern.structural.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * The proxy first checks the host you are connecting to, if it is not part of restricted site bannedSitesList,
 * then it connects to the real internet. This example is based on Protection proxies.
 *
 * @author Srinath.Rayabarapu
 */
public class InternetProxy implements IInternet{

	IInternet internet = new RealInternet();
	static List<String> bannedSitesList = new ArrayList<>();
	
	static{
		bannedSitesList.add("site1");
		bannedSitesList.add("site2");
		bannedSitesList.add("virus.com");
		bannedSitesList.add("site4");
	}
	
	@Override
	public void connectTo(String site) {
		// allow if the site is not present in banned sites bannedSitesList
		if(!bannedSitesList.contains(site)){
			internet.connectTo(site);
		} else{
			System.out.println("Cann't connect to bad site:" + site);
		}
	}
}