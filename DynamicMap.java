package map;
import java.util.*;

public class DynamicMap {
	public HashMap<String,String> acceptMap(){
		HashMap<String,String> mp1 = new HashMap<String,String>();
		System.out.println("Enter Values :");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 'end' for key and value to terminate");
		String s1 = sc.next();
		String s2 = sc.next();
		while (!s1.equals("end")) {
			mp1.put(s1, s2);
			s1=sc.next();
			s2=sc.next();
		}
		return mp1;
	}
	public void display (HashMap<String,String> hs) {
		Set<Map.Entry<String, String>> set = hs.entrySet();
		for(Map.Entry<String, String> hs1:set) {
			System.out.print(hs1.getKey()+" : ");
			System.out.println(hs1.getValue());
		}
	}

	public static void main(String[] args) {
		DynamicMap hd = new DynamicMap();
		HashMap<String,String> x;
		x = hd.acceptMap();
		hd.display(x);

	}

}
