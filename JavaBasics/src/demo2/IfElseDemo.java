package demo2;

import java.util.Scanner;

public class IfElseDemo {
	
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.println("What time is it now");
		String time = k.nextLine();
		
		if(time.equals("Morning")) {
			System.out.println("Prepare my breakfast");
		}
		
		else if(time.equals("AfterNoon")) {
			System.out.println("Prepare my lunch");
		}
		
		else {
			System.out.println("Prepare my dinner");
		}
		
				
	}

}
