package collectionsFramework;

import java.util.HashSet;

public class HashSetDemo {
	
	public static void main(String[] args) {
		HashSet<String> cities = new HashSet<>();
		
		cities.add("London");
		cities.add("Paris");
		cities.add("New york");
		cities.add("Tokyo");
		cities.add("New Delhi");
		cities.add("London");
		
		for(String t : cities) {  //for-each loop
			System.out.println(t);
		}
		
		System.out.println();
		
		System.out.println("Total number of elements in the hashset = " + cities.size());
//		System.out.println("Index of New York = " + cities.indexOf("New york"));
//		System.out.println("Element at 2nd index = " + cities.get(2));
		System.out.println("Is Hyderabad present in the list ? " + cities.contains("Hyderabad") );
	}

}
