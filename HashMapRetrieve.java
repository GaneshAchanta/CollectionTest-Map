package map;
import java.util.*;

public class HashMapRetrieve {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "One");
		hm.put(10, "Ten");
		hm.put(5, "Five");
		hm.put(7, "Seven");
		hm.put(4, "Four");
		hm.put(2, "Two");
		hm.put(3, "Three");
		System.out.println(hm); //entries are not sorted/ordered
		
		//retrieve only keys
		System.out.println("All Keys");
		Set<Integer> s = hm.keySet();
		for(int key:s)
			System.out.println(key);
		
		//retrieve only values
		System.out.println("All Values");
		Collection<String> c = hm.values() ;
		for(String value:c)
			System.out.println(value);
		
		//retrieve all entries
		System.out.println("All Entries");
		Set<Map.Entry<Integer, String>> s2 = hm.entrySet();
		for(Map.Entry<Integer, String> e:s2) {
			System.out.print(e.getKey());
			System.out.print("==");
			System.out.println(e.getValue());
		}
	}

}
