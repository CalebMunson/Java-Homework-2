package assignment2;

//Prompt 7: Write a program by using super keyword for a variable, method, and constructor

//This file has 2 classes, plane and boeing. boeing extends plane and it includes a method which calls the method from plane and the variables as well.
//It also contains a constructor which simply calls to the plane constructor via super.

public class Prompt7 {
	public static void main(String[] args) {
		boeing myPlane = new boeing();
		myPlane.fly();
		myPlane.test();
	}
}

class plane {
	int speed = 550;
	String color = "blue";
	
	plane() {
		System.out.println("The plane exists.");
	}
	
	void fly() {
		System.out.println("The plane is flying in the sky.");
	}
}

class boeing extends plane {
	int speed = 650;
	String color = "red";
	
	boeing() {
		super();
	}
	
	void fly() {
		System.out.println("The Boeing plane is flying in the sky.");
	}
	
	void test() {
		super.fly();
		System.out.println("The plane was originally painted " + super.color + " but is now painted " + color + "!");
		System.out.println("Boeing made improvements to the plane so it could fly at " + speed + " mph rather than " + super.speed + " mph!");
	}
	
}