package demo;

public class Test {
	
	public void mobile() {
		System.out.println("Apple makes Mobiles");
	}
	
	public static void main(String[] args) {
		
		final int x = 20;
		
		//x = x + 5;
		
		System.out.println(x);
		Calculator basicCal = new Calculator();
		basicCal.add(100, 20);
	}

}
