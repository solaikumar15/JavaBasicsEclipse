package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintExternalOutput {
	
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("D:\\EclipseWorkspace\\s35\\Output.txt");
		
		
			PrintWriter print = new PrintWriter(file);
			
			print.print("My name is Deepinder");
			print.close();
			
			Scanner k = new Scanner(System.in);
			System.out.println("Please enter today's day");
			String day = k.nextLine();
			
			if(day.equals("Monday")) {
				throw new NullPointerException();
			}
		
		
		
	}

}
