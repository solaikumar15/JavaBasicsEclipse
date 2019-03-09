package collectionsFramework;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>(); //ArrayList is a Generic Class
		
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
		
		System.out.println("Total number of elements in the arraylist = " + cities.size());
		System.out.println("Index of New York = " + cities.indexOf("New york"));
		System.out.println("Element at 2nd index = " + cities.get(2));
		System.out.println("Is Hyderabad present in the list ? " + cities.contains("Hyderabad") );
		
	}

}
