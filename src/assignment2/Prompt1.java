package assignment2;

//Prompt 1: Write a program for Inheritance example

//This file includes a car class and a ferrari class which extends the car class, inheriting the drive method from the car class.

public class Prompt1 {
	
	public static void main(String[] args) {
		ferrari F40 = new ferrari();
		F40.start();
		F40.drive();
	}
}

class car {
	public void drive() {
		System.out.println("Car goes vroom!");
	}
}

class ferrari extends car {
	public void start() {
		System.out.println("You put in the key and turn on the car.");
	}
}
