package inheritance;

public class Car extends Vehicle {

	int numDoors;
	int maxSpeed;
	
	
	public void print() {
		super.print();
		System.out.println(" Total doors : " +numDoors );
	}
	
}
