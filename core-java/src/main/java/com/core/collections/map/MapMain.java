package com.core.collections.map;

import java.util.HashMap;
import java.util.Map;

/**
 * use this class to test all map related scenarios
 * 
 * @author Srinath.Rayabarapu
 *
 */
public class MapMain {
	
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>(1);
		System.out.println(map.size());
		map.put("one", "one");
		System.out.println(map.size());
		map.put("two", "two");
		System.out.println(map.size());




	}

}
