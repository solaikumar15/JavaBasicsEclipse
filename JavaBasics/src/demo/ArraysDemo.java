package demo;

public class ArraysDemo {
	
	
	public static void month() {
		
		System.out.println("Today is the month of March");
	}
	

	public void date() {
		System.out.println("It is 11th March");
	}
	

	public void year( ) {
		System.out.println("It is 2019");
	}
	
	public void nextYear() {
		System.out.println("It will be 2020 next year");
	}

	public static void main(String[] args) {
		int[] numbers = new int[20];
		
		for(int i=0; i<20; i++) {
			numbers[i] = i+20;
			System.out.println(numbers[i]);
		}
		
		//A new comment
		
	}

}
