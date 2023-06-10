package map;
import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String,Double> hm = new HashMap<String,Double>();
		//put elements to the map
		hm.put("Ram", 3434.34);
		hm.put("Mohan", 123.33);
		hm.put("Rao", 1378.00);
		hm.put("Ravi", 99.22);
		hm.put("Raju", 19.08);
		System.out.println(hm);
		
		HashMap<String,Double> hm2 = new HashMap<String,Double>();
		System.out.println(hm2);
		hm2.putAll(hm);
		System.out.println(hm2);
		
		//Deposit 1000 into Ram's account
		double balance = hm.get("Ram"); // unboxing(conversion of object to primitive)
		hm.put("Ram", (balance+1000)); // boxing(conversion of primitive to object)
		System.out.println("Ram's new balance : "+hm.get("Ram"));

	}

}
