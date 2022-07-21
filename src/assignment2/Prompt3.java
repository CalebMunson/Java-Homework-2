package assignment2;

//Prompt 3: Write a program for constructor overloading

//This file includes a motorcycle class which includes 4 options for constructing a motorcycle, allowing you to change top speed, manufacturer, both, or none

public class Prompt3 {
	public static void main(String[] args) {
		motorcycle kawasaki = new motorcycle("Kawasaki");
		motorcycle harley = new motorcycle();
		motorcycle honda = new motorcycle(80, "Honda");
		motorcycle harley2 = new motorcycle(90);
		
		kawasaki.info();
		harley.info();
		honda.info();
		harley2.info();
	}
}

class motorcycle {
	int topSpeed = 100;
	String company = "Harley";
	
	motorcycle() {
		
	}
	
	motorcycle(int topSpeed, String company) {
		this.topSpeed = topSpeed;
		this.company = company;
	}
	
	motorcycle(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	
	motorcycle(String company) {
		this.company = company;
	}
	
	public void info() {
		System.out.println("The motorcycle is a " + company + " and it goes " + topSpeed + " mph.");
	}
}
