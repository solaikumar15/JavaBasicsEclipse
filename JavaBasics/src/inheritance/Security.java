package inheritance;

import demo2.Calculator;

public class Security extends Calculator{

	

	int annualBonus = 5000;
	
	public void message() {
		System.out.println("From next month onwards, everyone will get 2 WFHs");
	}
	
	
	public static void main(String[] args) {
		Security Paul = new Security();
		
		Paul.message();
		Paul.add(20, 20);
	}

}
