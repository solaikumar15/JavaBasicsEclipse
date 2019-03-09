package inheritance;

public class Paintshop extends Mechanical {

	int annualBonus = 6000;

	public static void main(String[] args) {

		Paintshop Krishna = new Paintshop();
		System.out.println("Total annual compensation of Krishna = $"+(Krishna.annualBonus+Krishna.annualSalary));
	}

}
