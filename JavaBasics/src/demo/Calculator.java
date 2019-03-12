package demo;

public class Calculator {

	// Defining the add method
	public void add(int a, int b) { // a and b are formal parameters
		System.out.println(a + b);
	}

	public void subtract(int a, int b) {
		System.out.println(a - b);
	}

	public int multiply(int a, int b) {
		return (a * b);
	}

	public void divide(int a, int b) {
		System.out.println(a / b);
	}
	
	public static void main(String[] args) {
		System.out.println("Tomorrow is Saturday");
		Calculator obj = new Calculator();
		obj.add(20, 30);
	}

	
	//Adding a new comment in line number 29
	//Adding a new comment in line 30
	//Adding a new comment in line 31


}
