package polymorphism;

public class Test {

	public static void main(String[] args) { // Class object = new Class()
		Features bv = new BasicVariant(); // ParentClass object = new ChildClass()
		Features mv = new MiddleVariant();
		Features tv = new TopendVariant();

		mv.airBags();
		mv.powerWindows();
		mv.sunroof();

		CommercialTax mvt = new MiddleVariant(); // Interface object = new ImplementingClass()
		CommercialTax tvt = new TopendVariant();

		mvt.tax();

		MiddleVariant mvv = new MiddleVariant();
		mvv.powerWindows();
		mvv.sunroof();
		mvv.tax();
		mvv.airBags();

	}

}
