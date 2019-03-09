package inheritance;

public class Accounts extends Management{

	

	int annualBonus = 8000;
	
	public static void main(String[] args) {
		Accounts Sam = new Accounts();
		Sam.message();
	}

}
