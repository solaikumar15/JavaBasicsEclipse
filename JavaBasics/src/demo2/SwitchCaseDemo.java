package demo2;

import java.util.Scanner;

public class SwitchCaseDemo {
	
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.println("What day is it today?");
		String day = k.nextLine();
		
		switch(day) {
		
		case "Monday":
			System.out.println("Wear a white dress");
			break;
			
		case "Tuesday":
			System.out.println("Wear an orange dress");
			break;
			
		case "Wednesday":
			System.out.println("Wear a yellow dress");
			break;
			
		case "Thursday":
			System.out.println("Wear a pink dress");
			break;
			
		case "Friday":
			System.out.println("Wear a brown dress");
			break;
			
		case "Saturday":
			System.out.println("Wear a magenta dress");
			break;
			
		case "Sunday":
			System.out.println("Wear a green dress");
		
		}
		
	}

}
