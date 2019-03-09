package polymorphism;

public class MiddleVariant extends Features implements CommercialTax {

	@Override // Features - Parent Class
	public void powerWindows() {
		System.out.println("Yes");

	}

	@Override // Features - Parent Class
	public void sunroof() {
		System.out.println("No");

	}

	@Override // Commercial Tax - Interface
	public void tax() {
		System.out.println("Extra Registration Fee - $2200");

	}
	
	// Features mv = new MiddleVariant();
	
	// CommercialTax mvt = new MiddleVariant(); 
	
	//MiddleVariant obj = new MiddleVariant();

}
