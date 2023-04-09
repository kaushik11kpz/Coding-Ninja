package inheritance_two;

import inheritance.Vehicle;

public class Truck extends Vehicle {

	int maxLoadingCapacity;
	
	public void print() {
		 System.out.println(" Vehicle color : " + getColor() + ", Maximum Speed : " + maxSpeed + ", Maximum Load " + maxLoadingCapacity );
		}
	
}
