package assignment2;

//Prompt 2: Write a program for method overloading

//This file includes a truck class which has an overloaded function 'drive' with the option to modify speed and whether it is shown in kmh or mph

public class Prompt2 {
	
	public static void main(String[] args) {
		truck F150 = new truck();
		F150.drive();
		F150.drive(40);
		F150.drive(65, "kmh");
	}
}

class truck {
	public void drive() {
		System.out.println("The truck is going 35 mph.");
	}
	
	public void drive(int speed) {
		System.out.println("The truck is going " + speed + " mph.");
	}
	
	public void drive(int speed, String measurement) {
		System.out.println("The truck is going " + speed + " " + measurement + ".");
	}
}
