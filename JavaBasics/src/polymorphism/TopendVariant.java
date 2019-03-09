package polymorphism;

public class TopendVariant extends Features implements CommercialTax{

	@Override //Features - Parent Class
	public void powerWindows() {
		System.out.println("Yes");

	}

	@Override //Features - Parent Class
	public void sunroof() {
		System.out.println("Yes");

	}

	@Override //Commercial Tax - Interface
	public void tax() {
		System.out.println("Extra Registration Fee - $2500");
		
	}

}
