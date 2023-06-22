package map;

import java.util.LinkedHashMap;
import java.util.*;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> hm = new LinkedHashMap<Integer,String>();
		hm.put(1, "One");
		hm.put(10, "Ten");
		hm.put(5, "Five");
		hm.put(7, "Seven");
		hm.put(4, "Four");
		hm.put(2, "Two");
		hm.put(3, "Three");
		System.out.println(hm);
		Set<Map.Entry<Integer, String>> s = hm.entrySet();
		for(Map.Entry<Integer, String> m:s) {
			System.out.print(m.getKey());
			System.out.print(" - ");
			System.out.println(m.getValue());
			
		}
		
	}
	
}