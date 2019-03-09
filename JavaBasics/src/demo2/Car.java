package demo2;

public class Car {
	
	private String color; //Variables declared at the class level are called as Fields
	private int numberOfSpokes;
	
	public Car(String color, int numberOfSpokes) {//Formal parameters
		this.color = color;
		this.numberOfSpokes = numberOfSpokes;
	}
	
	public Car() {
		color = "White";
		numberOfSpokes = 15;
	}
	
	
	public void printCarInfo() {
		System.out.println("Color of Car = " + color);
		System.out.println("Number of spokes = " + numberOfSpokes);
	}
	
	public static void numberOfSteeringWheels() {
		System.out.println("Number of steering wheels = 1");
	}
	
	public static void main(String[] args) {
		Car Mercedes = new Car("Silver",20);	
		Car Audi = new Car("Black",10);
		Car BMW = new Car();
		
		BMW.printCarInfo();
		numberOfSteeringWheels();
	}

}
