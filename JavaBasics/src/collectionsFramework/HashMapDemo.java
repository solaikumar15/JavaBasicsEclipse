package collectionsFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	
	public static void main(String[] args) {
		HashMap<String,Integer> td = new HashMap<>();
		
		td.put("Ram", 656565);
		td.put("Sham", 757575);
		td.put("John", 858585);
		td.put("Ram", 85858);
		
		for(Map.Entry t : td.entrySet()) {  //for(String t : cities)
			System.out.println(t.getKey() + " - " + t.getValue());
			
		}
		
	}

}
