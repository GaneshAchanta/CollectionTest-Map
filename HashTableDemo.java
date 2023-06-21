package map;

import java.util.*;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<String,Double> hs = new Hashtable<String,Double>();
		hs.put("Ram",4500.89);
		hs.put("Mohan",5500.89);
		hs.put("Siva",6500.89);
		hs.put("Ravi",8500.89);
		hs.put("Nani",7500.89);
		System.out.println(hs);
		
		//retrieve values by using Enumeration(Applicable for only Hashtable)
		Enumeration<Double> e = hs.elements();
		while (e.hasMoreElements())
			System.out.println(e.nextElement());

	}

}
