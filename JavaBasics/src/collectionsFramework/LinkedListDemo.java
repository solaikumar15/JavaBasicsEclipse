package collectionsFramework;

import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		LinkedList<String> cities = new LinkedList<>();
		
		cities.add("London");
		cities.add("Paris");
		cities.add("New york");
		cities.add("Tokyo");
		cities.add("New Delhi");
		
		
		for(String t : cities) {  //for-each loop
			System.out.println(t);
		}
		
		System.out.println();
		
		System.out.println("Total number of elements in the linkedlist = " + cities.size());
		System.out.println("Index of New York = " + cities.indexOf("New york"));
		System.out.println("Element at 2nd index = " + cities.get(2));
		System.out.println("Is Hyderabad present in the list ? " + cities.contains("Hyderabad") );
	}

}
