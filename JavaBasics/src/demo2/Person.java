package demo2;

public class Person {
	
	private String name;
	private int age;
	private String gendre;
	
	public Person(String name, int age, String gendre) {
		this.name = name;
		this.age = age;
		this.gendre = gendre;
	}
	
	public void printPersonDetails(Person obj) {
		System.out.println("Name of the person = " + obj.name);
		System.out.println("Age of the person = " + obj.age);
		System.out.println("Gender of the person = " + obj.gendre);
	}
	
	public static void main(String[] args) {
		Person objRam = new Person("Ram",25,"Male");
		Person objSham = new Person("Sham",30,"Male");
		Person objGeeta = new Person("Geeta", 28,"Female");
		
		objRam.printPersonDetails(objGeeta);
	}
	

}
