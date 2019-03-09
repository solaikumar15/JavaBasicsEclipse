package inheritance;

public class Mechanical extends Management {

	int annualBonus = 10000;

	public void month() {
		System.out.println("It is February");
	}

	@Override
	public void day() {
		System.out.println("Today is Thursday");
	}

	public static void main(String[] args) {
		Mechanical Ram = new Mechanical();
		System.out.println("Total annual compensation of Ram = $" + (Ram.annualSalary + Ram.annualBonus));

		Ram.month();
		Ram.day();
		Ram.message();
		
		try {
			Ram.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
