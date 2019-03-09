package loops;

import java.util.Scanner;

public class WhileLoopDemo {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		int correctPIN = 1234;

		System.out.println("Please enter you ATM PIN:");
		int enteredPIN = k.nextInt();

		while (enteredPIN != correctPIN) {
			System.out.println("Please enter you ATM PIN again:");
			enteredPIN = k.nextInt();
		}

		System.out.println("Welcome to ABC Bank!");
	}

}
