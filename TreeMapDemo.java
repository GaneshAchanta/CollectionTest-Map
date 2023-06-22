package map;

import java.util.*;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<String,Double> hs = new TreeMap<String,Double>();
		hs.put("Ram",4500.89);
		hs.put("Mohan",5500.89);
		hs.put("Siva",6500.89);
		hs.put("Ravi",8500.89);
		hs.put("Nani",7500.89);
		System.out.println(hs);
		
		System.out.println(hs.firstKey());
		System.out.println(hs.lastKey());
		System.out.println(hs.subMap("Nani", "Siva"));
		System.out.println(hs.headMap("Ram"));
		System.out.println(hs.tailMap("Ram"));

	}

}
