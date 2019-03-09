package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		try {
			System.out.println("Please enter a number - ");
			int num1 = k.nextInt();

			System.out.println("Please enter another number - ");
			int num2 = k.nextInt();			

			System.out.println("Result of division of " + num1 + " by " + num2 + " = " + (num1 / num2));
		}

		catch (ArithmeticException e) {
			System.out.println("Please do not enter 0 in the denominator. Check your 5th grade Mathematics book");
		}

		catch (InputMismatchException e) {
			System.out.println("Only integer vales are acceptable. Please enter integers only");
		}

		catch (Exception e) {
			System.out.println("Please enter a valid input");
		}
		
		finally {
			System.out.println("Today I will order a Pizza");
		}

	}

}
