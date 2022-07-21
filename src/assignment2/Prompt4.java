package assignment2;

//Prompt 4: Write a program for method overriding

//This file includes a dog class which extends the animal class and overrides the noise method

public class Prompt4 {
	public static void main(String[] args) {
		animal Farji = new dog();
		Farji.noise();
		animal Sola = new animal();
		Sola.noise();
	}
}

class animal {
	public void noise() {
		System.out.println("The animal makes a sound");
	}
}

class dog extends animal {
	public void noise() {
		System.out.println("The dog goes woof");
	}
}